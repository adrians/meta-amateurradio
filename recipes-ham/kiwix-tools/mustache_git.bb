LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=00f62fee8056dc37ed6566f4ab3ddf2a"

SRC_URI = "git://github.com/kainjow/Mustache.git;protocol=git;branch=master \
          "

SRCREV = "c7b2c92b18ef3d6577a1110ac7ff31e3df8b5362"

inherit cmake

S = "${WORKDIR}/git"

ALLOW_EMPTY_${PN} = "1"

do_install() {
    install -D -m 0755 ${S}/mustache.hpp ${D}${includedir}/mustache.hpp
}

