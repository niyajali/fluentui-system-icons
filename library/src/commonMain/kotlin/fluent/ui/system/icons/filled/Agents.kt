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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.Agents: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Agents",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.975f, 4.265f)
            curveTo(12.125f, 3.796f, 12.355f, 3.37f, 12.649f, 3f)
            horizontalLineTo(8.105f)
            curveTo(7.457f, 3f, 6.849f, 3.278f, 6.427f, 3.751f)
            horizontalLineTo(6.44f)
            curveTo(6.337f, 3.865f, 6.246f, 3.991f, 6.168f, 4.127f)
            lineTo(2.27f, 10.897f)
            curveTo(1.879f, 11.576f, 1.869f, 12.41f, 2.244f, 13.097f)
            lineTo(5.859f, 19.724f)
            curveTo(5.872f, 19.749f, 5.886f, 19.773f, 5.9f, 19.797f)
            curveTo(6.113f, 20.157f, 6.41f, 20.45f, 6.759f, 20.657f)
            lineTo(6.783f, 20.671f)
            curveTo(7.149f, 20.883f, 7.57f, 21f, 8.008f, 21f)
            curveTo(9.075f, 21f, 10.018f, 20.31f, 10.342f, 19.294f)
            lineTo(14.834f, 5.175f)
            curveTo(14.962f, 4.773f, 15.258f, 4.377f, 15.757f, 4.5f)
            curveTo(16.256f, 4.623f, 16.39f, 5.129f, 16.235f, 5.619f)
            lineTo(11.771f, 19.749f)
            curveTo(11.623f, 20.212f, 11.396f, 20.634f, 11.106f, 21f)
            horizontalLineTo(15.895f)
            curveTo(16.699f, 21f, 17.442f, 20.571f, 17.844f, 19.875f)
            lineTo(18.51f, 18.72f)
            lineTo(18.482f, 18.754f)
            lineTo(18.49f, 18.731f)
            lineTo(21.719f, 13.123f)
            curveTo(22.119f, 12.428f, 22.119f, 11.572f, 21.719f, 10.877f)
            lineTo(17.896f, 4.237f)
            curveTo(17.676f, 3.854f, 17.362f, 3.545f, 16.992f, 3.331f)
            lineTo(16.967f, 3.317f)
            curveTo(16.604f, 3.113f, 16.188f, 3f, 15.757f, 3f)
            curveTo(14.682f, 3f, 13.731f, 3.696f, 13.405f, 4.72f)
            lineTo(8.912f, 18.839f)
            curveTo(8.838f, 19.072f, 8.68f, 19.261f, 8.477f, 19.376f)
            curveTo(8.337f, 19.455f, 8.17f, 19.51f, 7.977f, 19.465f)
            curveTo(7.492f, 19.349f, 7.358f, 18.858f, 7.509f, 18.383f)
            lineTo(11.636f, 5.385f)
            horizontalLineTo(11.619f)
            lineTo(11.975f, 4.265f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AgentsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Agents, contentDescription = null)
    }
}
