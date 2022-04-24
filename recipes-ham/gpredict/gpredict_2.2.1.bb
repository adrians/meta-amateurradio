SUMMARY = "Gpredict"

DESCRIPTION = "Gpredict is a real-time satellite tracking and orbit prediction \
application. It can track a large number of satellites and display their \
position and other data in lists, tables, maps, and polar plots (radar view)."

HOMEPAGE = "http://gpredict.oz9aec.net/"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=892f569a555ba9c07a568a7c0c4fa63a"

SRC_URI = "https://github.com/csete/gpredict/releases/download/v2.2.1/gpredict-2.2.1.tar.bz2 \
          "

SRC_URI[md5sum] = "38a7bda79989c5921d1c0bcc6c238382"
SRC_URI[sha256sum] = "e759c4bae0b17b202a7c0f8281ff016f819b502780d3e77b46fe8767e7498e43"

inherit autotools-brokensep gettext pkgconfig

DEPENDS = "glib-2.0-native libtool-native intltool-native curl glib-2.0 goocanvas"

CFLAGS:append = " -Wl,--allow-multiple-definition"
RSUGGESTS:${PN} = "ntpdate"
