/*
 *  ____    _    ____  _   _ _____     ___    _
 * / ___|  / \  |  _ \| \ | |_ _\ \   / / \  | |
 * | |    / _ \ | |_) |  \| || | \ \ / / _ \ | |
 * | |___/ ___ \|  _ <| |\  || |  \ V / ___ \| |___
 * \____/_/   \_\_| \_\_| \_|___|  \_/_/   \_\_____|
 *
 * https://github.com/yingzhuo/carnival
 */
package com.github.yingzhuo.carnival.restful.security.role;

import lombok.ToString;

import java.util.Objects;

@ToString
public final class SimplePermission implements Permission {

    private final String name;

    public SimplePermission(String name) {
        this.name = Objects.requireNonNull(name);
    }

    @Override
    public String getPermissionName() {
        return name;
    }
}
