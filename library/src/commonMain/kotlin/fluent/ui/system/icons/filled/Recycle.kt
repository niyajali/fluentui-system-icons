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
 * Recycle Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent sustainable recycling practices and events.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_recycle_20_filled.svg)
 * 
 * @return The [ImageVector] for the Recycle icon.
 */
public val FluentIcons.Filled.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9f, 3.038f)
                curveTo(9.372f, 2.159f, 10.631f, 2.159f, 11.103f, 3.038f)
                lineTo(12.763f, 6.131f)
                lineTo(11.737f, 5.789f)
                curveTo(11.344f, 5.658f, 10.92f, 5.87f, 10.789f, 6.263f)
                curveTo(10.658f, 6.656f, 10.87f, 7.081f, 11.263f, 7.212f)
                lineTo(14.263f, 8.212f)
                curveTo(14.471f, 8.281f, 14.699f, 8.256f, 14.887f, 8.143f)
                curveTo(15.075f, 8.03f, 15.204f, 7.84f, 15.24f, 7.623f)
                lineTo(15.74f, 4.623f)
                curveTo(15.808f, 4.215f, 15.532f, 3.828f, 15.123f, 3.76f)
                curveTo(14.715f, 3.692f, 14.328f, 3.968f, 14.26f, 4.377f)
                lineTo(14.086f, 5.423f)
                lineTo(12.425f, 2.328f)
                curveTo(11.387f, 0.396f, 8.616f, 0.396f, 7.579f, 2.328f)
                lineTo(5.844f, 5.56f)
                curveTo(5.644f, 5.932f, 5.791f, 6.396f, 6.169f, 6.585f)
                curveTo(6.532f, 6.767f, 6.973f, 6.627f, 7.165f, 6.269f)
                lineTo(8.9f, 3.038f)
                close()
                moveTo(16.939f, 13.91f)
                lineTo(15.028f, 10.349f)
                curveTo(14.828f, 9.977f, 14.975f, 9.513f, 15.353f, 9.324f)
                curveTo(15.716f, 9.142f, 16.157f, 9.282f, 16.349f, 9.64f)
                lineTo(18.26f, 13.2f)
                curveTo(19.244f, 15.032f, 17.917f, 17.251f, 15.838f, 17.251f)
                horizontalLineTo(12.312f)
                lineTo(13.031f, 17.97f)
                curveTo(13.323f, 18.263f, 13.323f, 18.738f, 13.031f, 19.031f)
                curveTo(12.738f, 19.323f, 12.263f, 19.323f, 11.97f, 19.031f)
                lineTo(9.97f, 17.031f)
                curveTo(9.677f, 16.738f, 9.677f, 16.263f, 9.97f, 15.97f)
                lineTo(11.97f, 13.97f)
                curveTo(12.263f, 13.677f, 12.738f, 13.677f, 13.031f, 13.97f)
                curveTo(13.323f, 14.263f, 13.323f, 14.738f, 13.031f, 15.031f)
                lineTo(12.31f, 15.751f)
                horizontalLineTo(15.838f)
                curveTo(16.783f, 15.751f, 17.386f, 14.742f, 16.939f, 13.91f)
                close()
                moveTo(7.25f, 15.751f)
                curveTo(7.664f, 15.751f, 8.0f, 16.087f, 8.0f, 16.501f)
                curveTo(8.0f, 16.915f, 7.664f, 17.251f, 7.25f, 17.251f)
                horizontalLineTo(4.164f)
                curveTo(2.085f, 17.251f, 0.758f, 15.032f, 1.741f, 13.2f)
                lineTo(3.588f, 9.761f)
                lineTo(2.238f, 10.212f)
                curveTo(1.845f, 10.343f, 1.42f, 10.13f, 1.289f, 9.738f)
                curveTo(1.158f, 9.345f, 1.37f, 8.92f, 1.763f, 8.789f)
                lineTo(4.763f, 7.788f)
                curveTo(4.952f, 7.725f, 5.158f, 7.74f, 5.336f, 7.829f)
                curveTo(5.514f, 7.918f, 5.649f, 8.074f, 5.712f, 8.262f)
                lineTo(6.712f, 11.263f)
                curveTo(6.843f, 11.656f, 6.63f, 12.081f, 6.237f, 12.212f)
                curveTo(5.844f, 12.343f, 5.42f, 12.13f, 5.289f, 11.737f)
                lineTo(4.883f, 10.52f)
                lineTo(3.063f, 13.91f)
                curveTo(2.616f, 14.742f, 3.219f, 15.751f, 4.164f, 15.751f)
                horizontalLineTo(7.25f)
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
        Image(imageVector = FluentIcons.Filled.Recycle, contentDescription = "Recycle Icon")
    }
}

