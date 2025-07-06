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
 * CubeArrowCurveDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_cube_arrow_curve_down_20_regular.svg)
 * 
 * @return The [ImageVector] for the CubeArrowCurveDown icon.
 */
public val FluentIcons.Regular.CubeArrowCurveDown: ImageVector
    get() {
        if (_cubeArrowCurveDown != null) {
            return _cubeArrowCurveDown!!
        }
        _cubeArrowCurveDown = Builder(name = "CubeArrowCurveDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.004f, 5.495f)
                curveTo(1.004f, 3.012f, 3.019f, 1.0f, 5.504f, 1.0f)
                curveTo(7.989f, 1.0f, 10.004f, 3.012f, 10.004f, 5.495f)
                curveTo(10.004f, 7.977f, 7.989f, 9.99f, 5.504f, 9.99f)
                curveTo(3.019f, 9.99f, 1.004f, 7.977f, 1.004f, 5.495f)
                close()
                moveTo(7.4f, 6.39f)
                lineTo(6.504f, 7.286f)
                verticalLineTo(5.745f)
                curveTo(6.504f, 4.228f, 5.273f, 2.998f, 3.754f, 2.998f)
                horizontalLineTo(3.504f)
                curveTo(3.228f, 2.998f, 3.004f, 3.221f, 3.004f, 3.497f)
                curveTo(3.004f, 3.773f, 3.228f, 3.997f, 3.504f, 3.997f)
                horizontalLineTo(3.754f)
                curveTo(4.72f, 3.997f, 5.504f, 4.779f, 5.504f, 5.745f)
                verticalLineTo(7.286f)
                lineTo(4.607f, 6.39f)
                curveTo(4.412f, 6.195f, 4.096f, 6.195f, 3.9f, 6.39f)
                curveTo(3.705f, 6.585f, 3.705f, 6.902f, 3.9f, 7.097f)
                lineTo(5.652f, 8.847f)
                curveTo(5.7f, 8.894f, 5.754f, 8.929f, 5.813f, 8.953f)
                curveTo(5.871f, 8.978f, 5.936f, 8.991f, 6.004f, 8.991f)
                curveTo(6.072f, 8.991f, 6.136f, 8.978f, 6.195f, 8.953f)
                curveTo(6.254f, 8.929f, 6.31f, 8.893f, 6.357f, 8.845f)
                lineTo(8.107f, 7.097f)
                curveTo(8.303f, 6.902f, 8.303f, 6.585f, 8.107f, 6.39f)
                curveTo(7.912f, 6.195f, 7.596f, 6.195f, 7.4f, 6.39f)
                close()
                moveTo(2.001f, 9.733f)
                curveTo(2.308f, 9.986f, 2.643f, 10.207f, 3.001f, 10.39f)
                verticalLineTo(13.809f)
                curveTo(3.001f, 14.013f, 3.125f, 14.196f, 3.315f, 14.272f)
                lineTo(9.073f, 16.573f)
                curveTo(9.669f, 16.811f, 10.333f, 16.811f, 10.929f, 16.573f)
                lineTo(16.687f, 14.272f)
                curveTo(16.876f, 14.196f, 17.001f, 14.013f, 17.001f, 13.809f)
                verticalLineTo(6.171f)
                curveTo(17.001f, 5.967f, 16.876f, 5.783f, 16.687f, 5.707f)
                lineTo(10.929f, 3.407f)
                curveTo(10.802f, 3.356f, 10.671f, 3.316f, 10.539f, 3.287f)
                curveTo(10.373f, 2.911f, 10.167f, 2.557f, 9.925f, 2.231f)
                curveTo(10.392f, 2.22f, 10.86f, 2.303f, 11.301f, 2.48f)
                lineTo(17.058f, 4.78f)
                curveTo(17.628f, 5.008f, 18.001f, 5.559f, 18.001f, 6.171f)
                verticalLineTo(13.809f)
                curveTo(18.001f, 14.421f, 17.628f, 14.972f, 17.058f, 15.2f)
                lineTo(11.301f, 17.5f)
                curveTo(10.466f, 17.833f, 9.536f, 17.833f, 8.701f, 17.5f)
                lineTo(2.944f, 15.2f)
                curveTo(2.374f, 14.972f, 2.001f, 14.421f, 2.001f, 13.809f)
                verticalLineTo(9.733f)
                close()
                moveTo(10.537f, 7.707f)
                curveTo(10.282f, 8.286f, 9.929f, 8.812f, 9.501f, 9.266f)
                verticalLineTo(13.486f)
                curveTo(9.501f, 13.762f, 9.725f, 13.985f, 10.001f, 13.985f)
                curveTo(10.277f, 13.985f, 10.501f, 13.762f, 10.501f, 13.486f)
                verticalLineTo(8.816f)
                lineTo(14.704f, 6.95f)
                curveTo(14.956f, 6.838f, 15.07f, 6.543f, 14.958f, 6.291f)
                curveTo(14.846f, 6.039f, 14.55f, 5.925f, 14.298f, 6.037f)
                lineTo(10.537f, 7.707f)
                close()
            }
        }
        .build()
        return _cubeArrowCurveDown!!
    }

@Suppress("ObjectPropertyName")
private var _cubeArrowCurveDown: ImageVector? = null

@Preview
@Composable
private fun CubeArrowCurveDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CubeArrowCurveDown, contentDescription = "CubeArrowCurveDown Icon")
    }
}

