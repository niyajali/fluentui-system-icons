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
 * CallExclamation icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: call, exclamation
 * - Source: ic_fluent_call_exclamation_20_filled.svg
 * 
 * @return The [ImageVector] for the CallExclamation icon.
 */
public val FluentIcons.Filled.CallExclamation: ImageVector
    get() {
        if (_callExclamation != null) {
            return _callExclamation!!
        }
        _callExclamation = Builder(name = "CallExclamation", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.802f, 7.769f)
                lineTo(17.959f, 6.94f)
                curveTo(18.116f, 6.118f, 17.814f, 5.242f, 17.154f, 4.66f)
                curveTo(15.586f, 3.276f, 13.324f, 2.5f, 9.992f, 2.504f)
                curveTo(6.666f, 2.508f, 4.101f, 3.288f, 2.676f, 4.672f)
                curveTo(2.073f, 5.259f, 1.853f, 6.127f, 2.099f, 6.953f)
                lineTo(2.347f, 7.782f)
                curveTo(2.578f, 8.555f, 3.357f, 9.072f, 4.169f, 8.99f)
                lineTo(5.797f, 8.827f)
                curveTo(6.496f, 8.757f, 6.802f, 8.171f, 7.0f, 7.5f)
                curveTo(7.296f, 6.496f, 7.5f, 5.75f, 7.5f, 5.75f)
                curveTo(8.262f, 5.465f, 8.986f, 5.25f, 10.0f, 5.25f)
                curveTo(11.014f, 5.25f, 11.752f, 5.444f, 12.5f, 5.75f)
                curveTo(12.5f, 5.75f, 12.696f, 6.495f, 13.0f, 7.5f)
                curveTo(13.224f, 8.24f, 13.753f, 8.761f, 14.467f, 8.83f)
                lineTo(16.104f, 8.988f)
                curveTo(16.927f, 9.068f, 17.653f, 8.546f, 17.802f, 7.769f)
                close()
                moveTo(14.5f, 13.5f)
                curveTo(14.5f, 15.985f, 12.485f, 18.0f, 10.0f, 18.0f)
                curveTo(7.515f, 18.0f, 5.5f, 15.985f, 5.5f, 13.5f)
                curveTo(5.5f, 11.015f, 7.515f, 9.0f, 10.0f, 9.0f)
                curveTo(12.485f, 9.0f, 14.5f, 11.015f, 14.5f, 13.5f)
                close()
                moveTo(10.0f, 11.0f)
                curveTo(9.724f, 11.0f, 9.5f, 11.224f, 9.5f, 11.5f)
                verticalLineTo(13.5f)
                curveTo(9.5f, 13.776f, 9.724f, 14.0f, 10.0f, 14.0f)
                curveTo(10.276f, 14.0f, 10.5f, 13.776f, 10.5f, 13.5f)
                verticalLineTo(11.5f)
                curveTo(10.5f, 11.224f, 10.276f, 11.0f, 10.0f, 11.0f)
                close()
                moveTo(10.0f, 16.125f)
                curveTo(10.345f, 16.125f, 10.625f, 15.845f, 10.625f, 15.5f)
                curveTo(10.625f, 15.155f, 10.345f, 14.875f, 10.0f, 14.875f)
                curveTo(9.655f, 14.875f, 9.375f, 15.155f, 9.375f, 15.5f)
                curveTo(9.375f, 15.845f, 9.655f, 16.125f, 10.0f, 16.125f)
                close()
            }
        }
        .build()
        return _callExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _callExclamation: ImageVector? = null

@Preview
@Composable
private fun CallExclamationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CallExclamation, contentDescription = null)
    }
}

