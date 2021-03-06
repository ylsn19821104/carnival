/*
 *  ____    _    ____  _   _ _____     ___    _
 * / ___|  / \  |  _ \| \ | |_ _\ \   / / \  | |
 * | |    / _ \ | |_) |  \| || | \ \ / / _ \ | |
 * | |___/ ___ \|  _ <| |\  || |  \ V / ___ \| |___
 * \____/_/   \_\_| \_\_| \_|___|  \_/_/   \_\_____|
 *
 * https://github.com/yingzhuo/carnival
 */
package com.github.yingzhuo.carnival.jsr310;

import org.springframework.validation.BindingResult;

/**
 * @author 应卓
 */
public class ValidationException extends RuntimeException {

    public static void raiseIfNecessary(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw from(bindingResult);
        }
    }

    public static ValidationException from(BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            throw new IllegalArgumentException("BindingResult has NO errors!");
        }
        return new ValidationException(bindingResult);
    }

    private final BindingResult bindingResult;

    private ValidationException(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }

    public BindingResult getBindingResult() {
        return bindingResult;
    }

}
