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
 * Wallpaper Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent images made for device backgrounds.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_wallpaper_24_regular.svg)
 * 
 * @return The [ImageVector] for the Wallpaper icon.
 */
public val FluentIcons.Regular.Wallpaper: ImageVector
    get() {
        if (_wallpaper != null) {
            return _wallpaper!!
        }
        _wallpaper = Builder(name = "Wallpaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 3.0f, 11.0f, 3.336f, 11.0f, 3.75f)
                curveTo(11.0f, 4.164f, 10.664f, 4.5f, 10.25f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(10.25f)
                curveTo(4.5f, 10.664f, 4.164f, 11.0f, 3.75f, 11.0f)
                curveTo(3.336f, 11.0f, 3.0f, 10.664f, 3.0f, 10.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(13.0f, 3.75f)
                curveTo(13.0f, 3.336f, 13.336f, 3.0f, 13.75f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(10.25f)
                curveTo(21.0f, 10.664f, 20.664f, 11.0f, 20.25f, 11.0f)
                curveTo(19.836f, 11.0f, 19.5f, 10.664f, 19.5f, 10.25f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 4.5f, 13.0f, 4.164f, 13.0f, 3.75f)
                close()
                moveTo(3.75f, 13.0f)
                curveTo(4.164f, 13.0f, 4.5f, 13.336f, 4.5f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 17.956f, 4.536f, 18.154f, 4.601f, 18.338f)
                lineTo(10.232f, 12.707f)
                curveTo(11.208f, 11.731f, 12.792f, 11.731f, 13.768f, 12.707f)
                lineTo(19.399f, 18.338f)
                curveTo(19.464f, 18.154f, 19.5f, 17.956f, 19.5f, 17.75f)
                verticalLineTo(13.75f)
                curveTo(19.5f, 13.336f, 19.836f, 13.0f, 20.25f, 13.0f)
                curveTo(20.664f, 13.0f, 21.0f, 13.336f, 21.0f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 21.0f, 13.0f, 20.664f, 13.0f, 20.25f)
                curveTo(13.0f, 19.836f, 13.336f, 19.5f, 13.75f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(17.956f, 19.5f, 18.154f, 19.464f, 18.338f, 19.399f)
                lineTo(12.707f, 13.768f)
                curveTo(12.317f, 13.377f, 11.683f, 13.377f, 11.293f, 13.768f)
                lineTo(5.662f, 19.399f)
                curveTo(5.846f, 19.464f, 6.044f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 19.5f, 11.0f, 19.836f, 11.0f, 20.25f)
                curveTo(11.0f, 20.664f, 10.664f, 21.0f, 10.25f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(13.75f)
                curveTo(3.0f, 13.336f, 3.336f, 13.0f, 3.75f, 13.0f)
                close()
                moveTo(15.25f, 8.0f)
                curveTo(14.836f, 8.0f, 14.5f, 8.336f, 14.5f, 8.75f)
                curveTo(14.5f, 9.164f, 14.836f, 9.5f, 15.25f, 9.5f)
                curveTo(15.664f, 9.5f, 16.0f, 9.164f, 16.0f, 8.75f)
                curveTo(16.0f, 8.336f, 15.664f, 8.0f, 15.25f, 8.0f)
                close()
                moveTo(13.0f, 8.75f)
                curveTo(13.0f, 7.507f, 14.007f, 6.5f, 15.25f, 6.5f)
                curveTo(16.493f, 6.5f, 17.5f, 7.507f, 17.5f, 8.75f)
                curveTo(17.5f, 9.993f, 16.493f, 11.0f, 15.25f, 11.0f)
                curveTo(14.007f, 11.0f, 13.0f, 9.993f, 13.0f, 8.75f)
                close()
            }
        }
        .build()
        return _wallpaper!!
    }

@Suppress("ObjectPropertyName")
private var _wallpaper: ImageVector? = null

@Preview
@Composable
private fun WallpaperPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Wallpaper, contentDescription = "Wallpaper Icon")
    }
}

