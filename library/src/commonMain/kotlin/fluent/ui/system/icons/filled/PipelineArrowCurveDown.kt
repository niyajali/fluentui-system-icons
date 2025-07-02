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
 * PipelineArrowCurveDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: pipeline, arrow, curve, down
 * - Source: ic_fluent_pipeline_arrow_curve_down_20_filled.svg
 * 
 * @return The [ImageVector] for the PipelineArrowCurveDown icon.
 */
public val FluentIcons.Filled.PipelineArrowCurveDown: ImageVector
    get() {
        if (_pipelineArrowCurveDown != null) {
            return _pipelineArrowCurveDown!!
        }
        _pipelineArrowCurveDown = Builder(name = "PipelineArrowCurveDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 5.5f)
                curveTo(1.0f, 3.015f, 3.015f, 1.0f, 5.502f, 1.0f)
                curveTo(7.988f, 1.0f, 10.003f, 3.015f, 10.003f, 5.5f)
                curveTo(10.003f, 7.985f, 7.988f, 10.0f, 5.502f, 10.0f)
                curveTo(3.015f, 10.0f, 1.0f, 7.985f, 1.0f, 5.5f)
                close()
                moveTo(7.399f, 6.396f)
                lineTo(6.502f, 7.293f)
                verticalLineTo(5.75f)
                curveTo(6.502f, 4.231f, 5.27f, 3.0f, 3.751f, 3.0f)
                horizontalLineTo(3.501f)
                curveTo(3.225f, 3.0f, 3.001f, 3.224f, 3.001f, 3.5f)
                curveTo(3.001f, 3.776f, 3.225f, 4.0f, 3.501f, 4.0f)
                horizontalLineTo(3.751f)
                curveTo(4.718f, 4.0f, 5.502f, 4.784f, 5.502f, 5.75f)
                verticalLineTo(7.293f)
                lineTo(4.605f, 6.396f)
                curveTo(4.409f, 6.201f, 4.093f, 6.201f, 3.897f, 6.396f)
                curveTo(3.702f, 6.592f, 3.702f, 6.908f, 3.897f, 7.104f)
                lineTo(5.65f, 8.856f)
                curveTo(5.698f, 8.903f, 5.752f, 8.938f, 5.81f, 8.962f)
                curveTo(5.869f, 8.987f, 5.934f, 9.0f, 6.002f, 9.0f)
                curveTo(6.07f, 9.0f, 6.134f, 8.987f, 6.193f, 8.962f)
                curveTo(6.252f, 8.938f, 6.307f, 8.901f, 6.355f, 8.854f)
                lineTo(8.106f, 7.104f)
                curveTo(8.301f, 6.908f, 8.301f, 6.592f, 8.106f, 6.396f)
                curveTo(7.911f, 6.201f, 7.594f, 6.201f, 7.399f, 6.396f)
                close()
                moveTo(1.994f, 9.74f)
                curveTo(2.825f, 10.427f, 3.86f, 10.875f, 4.996f, 10.977f)
                verticalLineTo(14.501f)
                curveTo(4.995f, 15.329f, 4.323f, 16.0f, 3.495f, 16.0f)
                curveTo(2.666f, 16.0f, 1.994f, 15.328f, 1.994f, 14.5f)
                verticalLineTo(9.74f)
                close()
                moveTo(10.978f, 6.0f)
                curveTo(10.74f, 8.64f, 8.637f, 10.741f, 5.996f, 10.978f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.999f)
                lineTo(13.999f, 6.0f)
                horizontalLineTo(10.978f)
                close()
                moveTo(16.5f, 4.0f)
                curveTo(15.671f, 4.0f, 14.999f, 4.672f, 14.999f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(14.999f, 15.328f, 15.671f, 16.0f, 16.5f, 16.0f)
                curveTo(17.328f, 16.0f, 18.0f, 15.328f, 18.0f, 14.5f)
                verticalLineTo(5.5f)
                curveTo(18.0f, 4.672f, 17.328f, 4.0f, 16.5f, 4.0f)
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
        Image(imageVector = FluentIcons.Filled.PipelineArrowCurveDown, contentDescription = null)
    }
}

