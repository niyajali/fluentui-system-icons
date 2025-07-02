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
 * ClipboardBulletList icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: clipboard, bullet, list
 * - Source: ic_fluent_clipboard_bullet_list_20_regular.svg
 * 
 * @return The [ImageVector] for the ClipboardBulletList icon.
 */
public val FluentIcons.Regular.ClipboardBulletList: ImageVector
    get() {
        if (_clipboardBulletList != null) {
            return _clipboardBulletList!!
        }
        _clipboardBulletList = Builder(name = "ClipboardBulletList", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.5f)
                curveTo(9.0f, 8.224f, 9.224f, 8.0f, 9.5f, 8.0f)
                horizontalLineTo(13.0f)
                curveTo(13.276f, 8.0f, 13.5f, 8.224f, 13.5f, 8.5f)
                curveTo(13.5f, 8.776f, 13.276f, 9.0f, 13.0f, 9.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 9.0f, 9.0f, 8.776f, 9.0f, 8.5f)
                close()
                moveTo(9.0f, 11.5f)
                curveTo(9.0f, 11.224f, 9.224f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(13.0f)
                curveTo(13.276f, 11.0f, 13.5f, 11.224f, 13.5f, 11.5f)
                curveTo(13.5f, 11.776f, 13.276f, 12.0f, 13.0f, 12.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 12.0f, 9.0f, 11.776f, 9.0f, 11.5f)
                close()
                moveTo(9.0f, 14.5f)
                curveTo(9.0f, 14.224f, 9.224f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(13.0f)
                curveTo(13.276f, 14.0f, 13.5f, 14.224f, 13.5f, 14.5f)
                curveTo(13.5f, 14.776f, 13.276f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 15.0f, 9.0f, 14.776f, 9.0f, 14.5f)
                close()
                moveTo(8.0f, 8.5f)
                curveTo(8.0f, 8.914f, 7.664f, 9.25f, 7.25f, 9.25f)
                curveTo(6.836f, 9.25f, 6.5f, 8.914f, 6.5f, 8.5f)
                curveTo(6.5f, 8.086f, 6.836f, 7.75f, 7.25f, 7.75f)
                curveTo(7.664f, 7.75f, 8.0f, 8.086f, 8.0f, 8.5f)
                close()
                moveTo(8.0f, 11.5f)
                curveTo(8.0f, 11.914f, 7.664f, 12.25f, 7.25f, 12.25f)
                curveTo(6.836f, 12.25f, 6.5f, 11.914f, 6.5f, 11.5f)
                curveTo(6.5f, 11.086f, 6.836f, 10.75f, 7.25f, 10.75f)
                curveTo(7.664f, 10.75f, 8.0f, 11.086f, 8.0f, 11.5f)
                close()
                moveTo(7.25f, 15.25f)
                curveTo(7.664f, 15.25f, 8.0f, 14.914f, 8.0f, 14.5f)
                curveTo(8.0f, 14.086f, 7.664f, 13.75f, 7.25f, 13.75f)
                curveTo(6.836f, 13.75f, 6.5f, 14.086f, 6.5f, 14.5f)
                curveTo(6.5f, 14.914f, 6.836f, 15.25f, 7.25f, 15.25f)
                close()
                moveTo(7.085f, 3.0f)
                curveTo(7.291f, 2.417f, 7.847f, 2.0f, 8.5f, 2.0f)
                horizontalLineTo(11.5f)
                curveTo(12.153f, 2.0f, 12.709f, 2.417f, 12.915f, 3.0f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 3.0f, 16.0f, 3.672f, 16.0f, 4.5f)
                verticalLineTo(16.5f)
                curveTo(16.0f, 17.328f, 15.328f, 18.0f, 14.5f, 18.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 18.0f, 4.0f, 17.328f, 4.0f, 16.5f)
                verticalLineTo(4.5f)
                curveTo(4.0f, 3.672f, 4.672f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(7.085f)
                close()
                moveTo(8.5f, 3.0f)
                curveTo(8.224f, 3.0f, 8.0f, 3.224f, 8.0f, 3.5f)
                curveTo(8.0f, 3.776f, 8.224f, 4.0f, 8.5f, 4.0f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 4.0f, 12.0f, 3.776f, 12.0f, 3.5f)
                curveTo(12.0f, 3.224f, 11.776f, 3.0f, 11.5f, 3.0f)
                horizontalLineTo(8.5f)
                close()
                moveTo(7.085f, 4.0f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 4.0f, 5.0f, 4.224f, 5.0f, 4.5f)
                verticalLineTo(16.5f)
                curveTo(5.0f, 16.776f, 5.224f, 17.0f, 5.5f, 17.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 17.0f, 15.0f, 16.776f, 15.0f, 16.5f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 4.224f, 14.776f, 4.0f, 14.5f, 4.0f)
                horizontalLineTo(12.915f)
                curveTo(12.709f, 4.583f, 12.153f, 5.0f, 11.5f, 5.0f)
                horizontalLineTo(8.5f)
                curveTo(7.847f, 5.0f, 7.291f, 4.583f, 7.085f, 4.0f)
                close()
            }
        }
        .build()
        return _clipboardBulletList!!
    }

@Suppress("ObjectPropertyName")
private var _clipboardBulletList: ImageVector? = null

@Preview
@Composable
private fun ClipboardBulletListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClipboardBulletList, contentDescription = null)
    }
}

