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
 * Tablet Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent touch tablet devices.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tablet_24_regular.svg)
 * 
 * @return The [ImageVector] for the Tablet icon.
 */
public val FluentIcons.Regular.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = Builder(name = "Tablet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.749f, 4.0f)
                curveTo(20.992f, 4.0f, 21.999f, 5.007f, 21.999f, 6.25f)
                verticalLineTo(17.752f)
                curveTo(21.999f, 18.995f, 20.992f, 20.002f, 19.749f, 20.002f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.002f, 2.0f, 18.995f, 2.0f, 17.752f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.007f, 3.007f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.749f)
                close()
                moveTo(19.749f, 5.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
                verticalLineTo(17.752f)
                curveTo(3.5f, 18.167f, 3.836f, 18.502f, 4.25f, 18.502f)
                horizontalLineTo(19.749f)
                curveTo(20.163f, 18.502f, 20.499f, 18.167f, 20.499f, 17.752f)
                verticalLineTo(6.25f)
                curveTo(20.499f, 5.836f, 20.163f, 5.5f, 19.749f, 5.5f)
                close()
                moveTo(10.25f, 15.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 15.5f, 14.5f, 15.836f, 14.5f, 16.25f)
                curveTo(14.5f, 16.63f, 14.218f, 16.944f, 13.852f, 16.994f)
                lineTo(13.75f, 17.0f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 17.0f, 9.5f, 16.665f, 9.5f, 16.25f)
                curveTo(9.5f, 15.871f, 9.782f, 15.557f, 10.148f, 15.507f)
                lineTo(10.25f, 15.5f)
                horizontalLineTo(13.75f)
                horizontalLineTo(10.25f)
                close()
            }
        }
        .build()
        return _tablet!!
    }

@Suppress("ObjectPropertyName")
private var _tablet: ImageVector? = null

@Preview
@Composable
private fun TabletPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Tablet, contentDescription = "Tablet Icon")
    }
}

