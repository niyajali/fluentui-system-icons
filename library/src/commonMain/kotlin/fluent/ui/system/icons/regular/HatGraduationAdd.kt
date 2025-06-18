/**
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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.HatGraduationAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HatGraduationAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.5f)
            curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
            curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
            curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
            close()
            moveTo(18.001f, 7f)
            lineTo(18.001f, 9.504f)
            curveTo(18.001f, 9.78f, 17.777f, 10.003f, 17.501f, 10.003f)
            curveTo(17.225f, 10.003f, 17.001f, 9.78f, 17.001f, 9.504f)
            lineTo(17.001f, 7f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 7f, 13.996f, 6.776f, 13.996f, 6.5f)
            curveTo(13.996f, 6.224f, 14.22f, 6f, 14.496f, 6f)
            horizontalLineTo(17f)
            lineTo(17f, 3.499f)
            curveTo(17f, 3.223f, 17.224f, 2.999f, 17.5f, 2.999f)
            curveTo(17.776f, 2.999f, 18f, 3.223f, 18f, 3.499f)
            lineTo(18f, 6f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 6f, 20.996f, 6.224f, 20.996f, 6.5f)
            curveTo(20.996f, 6.776f, 20.772f, 7f, 20.497f, 7f)
            horizontalLineTo(18.001f)
            close()
            moveTo(17.5f, 13f)
            curveTo(18.016f, 13f, 18.518f, 12.94f, 19f, 12.826f)
            verticalLineTo(17.75f)
            curveTo(19f, 17.912f, 18.947f, 18.07f, 18.85f, 18.2f)
            lineTo(18.849f, 18.201f)
            lineTo(18.848f, 18.203f)
            lineTo(18.845f, 18.207f)
            lineTo(18.836f, 18.218f)
            lineTo(18.821f, 18.237f)
            lineTo(18.811f, 18.25f)
            curveTo(18.79f, 18.275f, 18.762f, 18.309f, 18.725f, 18.351f)
            curveTo(18.652f, 18.435f, 18.547f, 18.548f, 18.408f, 18.682f)
            curveTo(18.131f, 18.948f, 17.718f, 19.295f, 17.159f, 19.639f)
            curveTo(16.036f, 20.33f, 14.339f, 21f, 12f, 21f)
            curveTo(9.661f, 21f, 7.964f, 20.33f, 6.841f, 19.639f)
            curveTo(6.282f, 19.295f, 5.87f, 18.948f, 5.592f, 18.682f)
            curveTo(5.453f, 18.548f, 5.348f, 18.435f, 5.275f, 18.351f)
            curveTo(5.232f, 18.303f, 5.19f, 18.253f, 5.151f, 18.201f)
            lineTo(5.15f, 18.2f)
            curveTo(5.053f, 18.07f, 5f, 17.912f, 5f, 17.75f)
            verticalLineTo(12.193f)
            lineTo(3f, 10.886f)
            verticalLineTo(16.25f)
            curveTo(3f, 16.664f, 2.664f, 17f, 2.25f, 17f)
            curveTo(1.836f, 17f, 1.5f, 16.664f, 1.5f, 16.25f)
            verticalLineTo(9.5f)
            curveTo(1.5f, 9.229f, 1.643f, 8.992f, 1.858f, 8.861f)
            lineTo(9.909f, 3.7f)
            curveTo(10.536f, 3.297f, 11.251f, 3.093f, 11.967f, 3.087f)
            curveTo(11.658f, 3.587f, 11.415f, 4.131f, 11.25f, 4.708f)
            curveTo(11.066f, 4.77f, 10.887f, 4.854f, 10.718f, 4.962f)
            lineTo(3.63f, 9.506f)
            lineTo(10.701f, 14.125f)
            curveTo(11.49f, 14.641f, 12.51f, 14.641f, 13.299f, 14.125f)
            lineTo(15.501f, 12.687f)
            curveTo(16.131f, 12.89f, 16.802f, 13f, 17.5f, 13f)
            close()
            moveTo(14.119f, 15.381f)
            curveTo(12.832f, 16.222f, 11.168f, 16.222f, 9.881f, 15.381f)
            lineTo(6.5f, 13.173f)
            verticalLineTo(17.469f)
            curveTo(6.537f, 17.507f, 6.58f, 17.551f, 6.631f, 17.6f)
            curveTo(6.841f, 17.802f, 7.171f, 18.08f, 7.627f, 18.361f)
            curveTo(8.536f, 18.92f, 9.964f, 19.5f, 12f, 19.5f)
            curveTo(14.036f, 19.5f, 15.464f, 18.92f, 16.373f, 18.361f)
            curveTo(16.829f, 18.08f, 17.159f, 17.802f, 17.369f, 17.6f)
            curveTo(17.42f, 17.551f, 17.463f, 17.507f, 17.5f, 17.469f)
            verticalLineTo(13.173f)
            lineTo(14.119f, 15.381f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HatGraduationAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HatGraduationAdd, contentDescription = null)
    }
}
