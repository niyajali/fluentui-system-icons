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

package fluent.ui.system.icons.filled

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
 * ArrowWrap Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for text/shape wrapping scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_wrap_20_filled.svg)
 * 
 * @return The [ImageVector] for the ArrowWrap icon.
 */
public val FluentIcons.Filled.ArrowWrap: ImageVector
    get() {
        if (_arrowWrap != null) {
            return _arrowWrap!!
        }
        _arrowWrap = Builder(name = "ArrowWrap", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.75f, 3.5f)
                curveTo(15.545f, 3.5f, 17.0f, 4.955f, 17.0f, 6.75f)
                curveTo(17.0f, 8.545f, 15.545f, 10.0f, 13.75f, 10.0f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 10.0f, 4.5f, 10.783f, 4.5f, 11.75f)
                curveTo(4.5f, 12.717f, 5.284f, 13.5f, 6.25f, 13.5f)
                horizontalLineTo(15.439f)
                lineTo(15.22f, 13.28f)
                curveTo(14.927f, 12.987f, 14.927f, 12.513f, 15.22f, 12.22f)
                curveTo(15.513f, 11.927f, 15.987f, 11.927f, 16.28f, 12.22f)
                lineTo(17.78f, 13.72f)
                curveTo(18.073f, 14.013f, 18.073f, 14.487f, 17.78f, 14.78f)
                lineTo(16.28f, 16.28f)
                curveTo(15.987f, 16.573f, 15.513f, 16.573f, 15.22f, 16.28f)
                curveTo(14.927f, 15.987f, 14.927f, 15.513f, 15.22f, 15.22f)
                lineTo(15.439f, 15.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 15.0f, 3.0f, 13.545f, 3.0f, 11.75f)
                curveTo(3.0f, 9.955f, 4.455f, 8.5f, 6.25f, 8.5f)
                horizontalLineTo(13.75f)
                curveTo(14.717f, 8.5f, 15.5f, 7.716f, 15.5f, 6.75f)
                curveTo(15.5f, 5.784f, 14.717f, 5.0f, 13.75f, 5.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 5.0f, 3.0f, 4.664f, 3.0f, 4.25f)
                curveTo(3.0f, 3.836f, 3.336f, 3.5f, 3.75f, 3.5f)
                horizontalLineTo(13.75f)
                close()
            }
        }
        .build()
        return _arrowWrap!!
    }

@Suppress("ObjectPropertyName")
private var _arrowWrap: ImageVector? = null

@Preview
@Composable
private fun ArrowWrapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowWrap, contentDescription = "ArrowWrap Icon")
    }
}

