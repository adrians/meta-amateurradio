# Package required only by gpredict.
SUMMARY = "goocanvas"

DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the cairo 2D \
library for drawing."

HOMEPAGE = "https://wiki.gnome.org/Projects/GooCanvas"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=3bf50002aefd002f49e7bb854063f7e7"

SRC_URI = "http://ftp.gnome.org/pub/GNOME/sources/${BPN}/3.0/${BPN}-${PV}.tar.xz \
          "
SRC_URI[md5sum] = "a0aafafa7107527c0c730ed967d4f653"
SRC_URI[sha256sum] = "670a7557fe185c2703a14a07506156eceb7cea3b4bf75076a573f34ac52b401a"

inherit autotools gettext gtk-doc gobject-introspection

DEPENDS = "cairo gtk+3"
