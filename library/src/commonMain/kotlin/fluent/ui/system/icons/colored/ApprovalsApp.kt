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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.ApprovalsApp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ApprovalsApp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(3.25f, 3.175f),
                end = Offset(9.247f, 25.271f)
            )
        ) {
            moveTo(12.744f, 2.293f)
            curveTo(12.354f, 1.902f, 11.72f, 1.902f, 11.33f, 2.293f)
            curveTo(10.939f, 2.683f, 10.939f, 3.317f, 11.33f, 3.707f)
            lineTo(12.019f, 4.396f)
            curveTo(7.174f, 4.406f, 3.25f, 8.336f, 3.25f, 13.183f)
            curveTo(3.25f, 18.036f, 7.184f, 21.97f, 12.037f, 21.97f)
            curveTo(16.89f, 21.97f, 20.824f, 18.036f, 20.824f, 13.183f)
            curveTo(20.824f, 12.631f, 20.376f, 12.183f, 19.824f, 12.183f)
            curveTo(19.272f, 12.183f, 18.824f, 12.631f, 18.824f, 13.183f)
            curveTo(18.824f, 16.931f, 15.785f, 19.97f, 12.037f, 19.97f)
            curveTo(8.289f, 19.97f, 5.25f, 16.931f, 5.25f, 13.183f)
            curveTo(5.25f, 9.441f, 8.279f, 6.406f, 12.019f, 6.396f)
            lineTo(11.33f, 7.085f)
            curveTo(10.939f, 7.475f, 10.939f, 8.109f, 11.33f, 8.499f)
            curveTo(11.72f, 8.89f, 12.354f, 8.89f, 12.744f, 8.499f)
            lineTo(15.14f, 6.103f)
            curveTo(15.531f, 5.713f, 15.531f, 5.079f, 15.14f, 4.689f)
            lineTo(12.744f, 2.293f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF309C61)
                ),
                start = Offset(16.024f, 10.428f),
                end = Offset(7.892f, 14.47f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16.937f, 9.481f)
            curveTo(17.328f, 9.871f, 17.328f, 10.505f, 16.937f, 10.895f)
            lineTo(12.145f, 15.687f)
            curveTo(11.755f, 16.078f, 11.122f, 16.078f, 10.731f, 15.687f)
            lineTo(8.934f, 13.89f)
            curveTo(8.543f, 13.5f, 8.543f, 12.866f, 8.934f, 12.476f)
            curveTo(9.325f, 12.085f, 9.958f, 12.085f, 10.348f, 12.476f)
            lineTo(11.438f, 13.566f)
            lineTo(15.523f, 9.481f)
            curveTo(15.913f, 9.09f, 16.547f, 9.09f, 16.937f, 9.481f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ApprovalsAppPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.ApprovalsApp, contentDescription = null)
    }
}
