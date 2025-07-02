/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * ContactCardLink icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: contact, card, link
 * - Source: ic_fluent_contact_card_link_20_regular.svg
 * 
 * @return The [ImageVector] for the ContactCardLink icon.
 */
public val FluentIcons.Regular.ContactCardLink: ImageVector
    get() {
        if (_contactCardLink != null) {
            return _contactCardLink!!
        }
        _contactCardLink = Builder(name = "ContactCardLink", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 10.0f)
                curveTo(7.328f, 10.0f, 8.0f, 9.328f, 8.0f, 8.5f)
                curveTo(8.0f, 7.672f, 7.328f, 7.0f, 6.5f, 7.0f)
                curveTo(5.672f, 7.0f, 5.0f, 7.672f, 5.0f, 8.5f)
                curveTo(5.0f, 9.328f, 5.672f, 10.0f, 6.5f, 10.0f)
                close()
                moveTo(4.949f, 10.75f)
                curveTo(4.425f, 10.75f, 4.0f, 11.175f, 4.0f, 11.699f)
                curveTo(4.0f, 12.546f, 4.577f, 13.285f, 5.399f, 13.49f)
                lineTo(5.458f, 13.505f)
                curveTo(6.142f, 13.676f, 6.858f, 13.676f, 7.542f, 13.505f)
                lineTo(7.601f, 13.49f)
                curveTo(8.423f, 13.285f, 9.0f, 12.546f, 9.0f, 11.699f)
                curveTo(9.0f, 11.175f, 8.575f, 10.75f, 8.051f, 10.75f)
                horizontalLineTo(4.949f)
                close()
                moveTo(11.0f, 8.5f)
                curveTo(11.0f, 8.224f, 11.224f, 8.0f, 11.5f, 8.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 8.0f, 15.0f, 8.224f, 15.0f, 8.5f)
                curveTo(15.0f, 8.776f, 14.776f, 9.0f, 14.5f, 9.0f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 9.0f, 11.0f, 8.776f, 11.0f, 8.5f)
                close()
                moveTo(9.035f, 15.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 15.0f, 3.0f, 14.664f, 3.0f, 14.25f)
                verticalLineTo(5.75f)
                curveTo(3.0f, 5.336f, 3.336f, 5.0f, 3.75f, 5.0f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 5.0f, 17.0f, 5.336f, 17.0f, 5.75f)
                verticalLineTo(11.035f)
                curveTo(17.353f, 11.086f, 17.689f, 11.189f, 18.0f, 11.337f)
                verticalLineTo(5.75f)
                curveTo(18.0f, 4.784f, 17.216f, 4.0f, 16.25f, 4.0f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 4.0f, 2.0f, 4.784f, 2.0f, 5.75f)
                verticalLineTo(14.25f)
                curveTo(2.0f, 15.217f, 2.783f, 16.0f, 3.75f, 16.0f)
                horizontalLineTo(9.337f)
                curveTo(9.189f, 15.689f, 9.086f, 15.353f, 9.035f, 15.0f)
                close()
                moveTo(12.5f, 12.0f)
                curveTo(11.119f, 12.0f, 10.0f, 13.119f, 10.0f, 14.5f)
                curveTo(10.0f, 15.881f, 11.119f, 17.0f, 12.5f, 17.0f)
                horizontalLineTo(13.0f)
                curveTo(13.276f, 17.0f, 13.5f, 16.776f, 13.5f, 16.5f)
                curveTo(13.5f, 16.224f, 13.276f, 16.0f, 13.0f, 16.0f)
                horizontalLineTo(12.5f)
                curveTo(11.672f, 16.0f, 11.0f, 15.328f, 11.0f, 14.5f)
                curveTo(11.0f, 13.672f, 11.672f, 13.0f, 12.5f, 13.0f)
                horizontalLineTo(13.0f)
                curveTo(13.276f, 13.0f, 13.5f, 12.776f, 13.5f, 12.5f)
                curveTo(13.5f, 12.224f, 13.276f, 12.0f, 13.0f, 12.0f)
                horizontalLineTo(12.5f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(15.724f, 12.0f, 15.5f, 12.224f, 15.5f, 12.5f)
                curveTo(15.5f, 12.776f, 15.724f, 13.0f, 16.0f, 13.0f)
                horizontalLineTo(16.5f)
                curveTo(17.328f, 13.0f, 18.0f, 13.672f, 18.0f, 14.5f)
                curveTo(18.0f, 15.328f, 17.328f, 16.0f, 16.5f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(15.724f, 16.0f, 15.5f, 16.224f, 15.5f, 16.5f)
                curveTo(15.5f, 16.776f, 15.724f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 17.0f, 19.0f, 15.881f, 19.0f, 14.5f)
                curveTo(19.0f, 13.119f, 17.881f, 12.0f, 16.5f, 12.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(12.0f, 14.5f)
                curveTo(12.0f, 14.224f, 12.224f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 14.0f, 17.0f, 14.224f, 17.0f, 14.5f)
                curveTo(17.0f, 14.776f, 16.776f, 15.0f, 16.5f, 15.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 15.0f, 12.0f, 14.776f, 12.0f, 14.5f)
                close()
            }
        }
        .build()
        return _contactCardLink!!
    }

@Suppress("ObjectPropertyName")
private var _contactCardLink: ImageVector? = null

@Preview
@Composable
private fun ContactCardLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ContactCardLink, contentDescription = null)
    }
}

