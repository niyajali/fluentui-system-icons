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
 * Recycle Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent sustainable recycling practices and events.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_recycle_20_regular.svg)
 * 
 * @return The [ImageVector] for the Recycle icon.
 */
public val FluentIcons.Regular.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.323f, 2.919f)
                curveTo(10.757f, 1.865f, 9.245f, 1.865f, 8.68f, 2.919f)
                lineTo(6.826f, 6.371f)
                curveTo(6.698f, 6.61f, 6.404f, 6.703f, 6.162f, 6.582f)
                curveTo(5.91f, 6.456f, 5.812f, 6.146f, 5.945f, 5.898f)
                lineTo(7.799f, 2.446f)
                curveTo(8.742f, 0.69f, 11.261f, 0.69f, 12.204f, 2.447f)
                lineTo(14.212f, 6.188f)
                lineTo(14.507f, 4.418f)
                curveTo(14.552f, 4.145f, 14.81f, 3.961f, 15.082f, 4.007f)
                curveTo(15.355f, 4.052f, 15.539f, 4.31f, 15.493f, 4.582f)
                lineTo(14.993f, 7.582f)
                curveTo(14.969f, 7.726f, 14.883f, 7.853f, 14.758f, 7.928f)
                curveTo(14.633f, 8.004f, 14.481f, 8.021f, 14.342f, 7.974f)
                lineTo(11.342f, 6.974f)
                curveTo(11.08f, 6.887f, 10.939f, 6.604f, 11.026f, 6.342f)
                curveTo(11.113f, 6.08f, 11.396f, 5.938f, 11.658f, 6.026f)
                lineTo(13.28f, 6.566f)
                lineTo(11.323f, 2.919f)
                close()
                moveTo(15.346f, 9.327f)
                curveTo(15.094f, 9.453f, 14.996f, 9.762f, 15.129f, 10.011f)
                lineTo(17.159f, 13.792f)
                curveTo(17.695f, 14.791f, 16.971f, 16.001f, 15.837f, 16.001f)
                horizontalLineTo(11.706f)
                lineTo(12.854f, 14.854f)
                curveTo(13.049f, 14.658f, 13.049f, 14.342f, 12.854f, 14.146f)
                curveTo(12.658f, 13.951f, 12.342f, 13.951f, 12.147f, 14.146f)
                lineTo(10.147f, 16.146f)
                curveTo(9.951f, 16.342f, 9.951f, 16.658f, 10.147f, 16.854f)
                lineTo(12.147f, 18.854f)
                curveTo(12.342f, 19.049f, 12.658f, 19.049f, 12.854f, 18.854f)
                curveTo(13.049f, 18.658f, 13.049f, 18.342f, 12.854f, 18.146f)
                lineTo(11.708f, 17.001f)
                horizontalLineTo(15.837f)
                curveTo(17.727f, 17.001f, 18.934f, 14.984f, 18.04f, 13.318f)
                lineTo(16.01f, 9.538f)
                curveTo(15.882f, 9.299f, 15.588f, 9.206f, 15.346f, 9.327f)
                close()
                moveTo(4.164f, 16.001f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 16.001f, 8.0f, 16.225f, 8.0f, 16.501f)
                curveTo(8.0f, 16.777f, 7.776f, 17.001f, 7.5f, 17.001f)
                horizontalLineTo(4.164f)
                curveTo(2.273f, 17.001f, 1.067f, 14.984f, 1.961f, 13.318f)
                lineTo(4.105f, 9.325f)
                lineTo(2.158f, 9.974f)
                curveTo(1.896f, 10.062f, 1.613f, 9.92f, 1.526f, 9.658f)
                curveTo(1.438f, 9.396f, 1.58f, 9.113f, 1.842f, 9.026f)
                lineTo(4.842f, 8.025f)
                curveTo(4.968f, 7.983f, 5.105f, 7.993f, 5.224f, 8.052f)
                curveTo(5.342f, 8.111f, 5.433f, 8.215f, 5.474f, 8.341f)
                lineTo(6.474f, 11.342f)
                curveTo(6.562f, 11.604f, 6.42f, 11.887f, 6.158f, 11.974f)
                curveTo(5.896f, 12.062f, 5.613f, 11.92f, 5.526f, 11.658f)
                lineTo(4.937f, 9.89f)
                lineTo(2.842f, 13.791f)
                curveTo(2.306f, 14.791f, 3.03f, 16.001f, 4.164f, 16.001f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

@Suppress("ObjectPropertyName")
private var _recycle: ImageVector? = null

@Preview
@Composable
private fun RecyclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Recycle, contentDescription = "Recycle Icon")
    }
}

