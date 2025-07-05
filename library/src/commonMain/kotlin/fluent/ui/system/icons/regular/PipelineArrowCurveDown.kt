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
 * PipelineArrowCurveDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent pipeline process in coding experiences.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_pipeline_arrow_curve_down_20_regular.svg)
 * 
 * @return The [ImageVector] for the PipelineArrowCurveDown icon.
 */
public val FluentIcons.Regular.PipelineArrowCurveDown: ImageVector
    get() {
        if (_pipelineArrowCurveDown != null) {
            return _pipelineArrowCurveDown!!
        }
        _pipelineArrowCurveDown = Builder(name = "PipelineArrowCurveDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.98f, 6.0f)
                curveTo(10.949f, 6.343f, 10.886f, 6.678f, 10.795f, 7.0f)
                horizontalLineTo(14.998f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.993f)
                verticalLineTo(10.977f)
                curveTo(4.65f, 10.946f, 4.315f, 10.883f, 3.993f, 10.791f)
                verticalLineTo(14.5f)
                curveTo(3.993f, 14.776f, 3.769f, 15.0f, 3.493f, 15.0f)
                curveTo(3.216f, 15.0f, 2.992f, 14.776f, 2.992f, 14.5f)
                verticalLineTo(10.397f)
                curveTo(2.634f, 10.214f, 2.299f, 9.992f, 1.992f, 9.738f)
                verticalLineTo(14.5f)
                curveTo(1.992f, 15.328f, 2.664f, 16.0f, 3.493f, 16.0f)
                curveTo(4.321f, 16.0f, 4.993f, 15.328f, 4.993f, 14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.998f)
                verticalLineTo(14.5f)
                curveTo(14.998f, 15.328f, 15.67f, 16.0f, 16.499f, 16.0f)
                curveTo(17.328f, 16.0f, 18.0f, 15.328f, 18.0f, 14.5f)
                verticalLineTo(5.5f)
                curveTo(18.0f, 4.672f, 17.328f, 4.0f, 16.499f, 4.0f)
                curveTo(15.67f, 4.0f, 14.998f, 4.672f, 14.998f, 5.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.98f)
                close()
                moveTo(16.499f, 5.0f)
                curveTo(16.775f, 5.0f, 17.0f, 5.224f, 17.0f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 14.776f, 16.775f, 15.0f, 16.499f, 15.0f)
                curveTo(16.223f, 15.0f, 15.999f, 14.776f, 15.999f, 14.5f)
                verticalLineTo(5.5f)
                curveTo(15.999f, 5.224f, 16.223f, 5.0f, 16.499f, 5.0f)
                close()
                moveTo(5.502f, 1.0f)
                curveTo(3.016f, 1.0f, 1.0f, 3.015f, 1.0f, 5.5f)
                curveTo(1.0f, 7.985f, 3.016f, 10.0f, 5.502f, 10.0f)
                curveTo(7.989f, 10.0f, 10.005f, 7.985f, 10.005f, 5.5f)
                curveTo(10.005f, 3.015f, 7.989f, 1.0f, 5.502f, 1.0f)
                close()
                moveTo(8.107f, 6.396f)
                curveTo(8.303f, 6.592f, 8.303f, 6.908f, 8.107f, 7.104f)
                lineTo(6.356f, 8.854f)
                curveTo(6.308f, 8.901f, 6.253f, 8.938f, 6.194f, 8.962f)
                curveTo(6.135f, 8.987f, 6.07f, 9.0f, 6.003f, 9.0f)
                curveTo(5.935f, 9.0f, 5.87f, 8.987f, 5.811f, 8.962f)
                curveTo(5.753f, 8.938f, 5.698f, 8.903f, 5.651f, 8.856f)
                lineTo(3.898f, 7.104f)
                curveTo(3.703f, 6.908f, 3.703f, 6.592f, 3.898f, 6.396f)
                curveTo(4.093f, 6.201f, 4.41f, 6.201f, 4.605f, 6.396f)
                lineTo(5.502f, 7.293f)
                verticalLineTo(5.75f)
                curveTo(5.502f, 4.784f, 4.718f, 4.0f, 3.751f, 4.0f)
                horizontalLineTo(3.501f)
                curveTo(3.225f, 4.0f, 3.001f, 3.776f, 3.001f, 3.5f)
                curveTo(3.001f, 3.224f, 3.225f, 3.0f, 3.501f, 3.0f)
                horizontalLineTo(3.751f)
                curveTo(5.271f, 3.0f, 6.503f, 4.231f, 6.503f, 5.75f)
                verticalLineTo(7.293f)
                lineTo(7.4f, 6.396f)
                curveTo(7.595f, 6.201f, 7.912f, 6.201f, 8.107f, 6.396f)
                close()
            }
        }
        .build()
        return _pipelineArrowCurveDown!!
    }

@Suppress("ObjectPropertyName")
private var _pipelineArrowCurveDown: ImageVector? = null

@Preview
@Composable
private fun PipelineArrowCurveDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PipelineArrowCurveDown, contentDescription = "PipelineArrowCurveDown Icon")
    }
}

