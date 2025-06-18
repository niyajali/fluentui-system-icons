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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Agents: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Agents",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.757f, 4.5f)
            curveTo(16.103f, 4.5f, 16.423f, 4.685f, 16.596f, 4.985f)
            lineTo(20.419f, 11.626f)
            curveTo(20.553f, 11.857f, 20.553f, 12.143f, 20.419f, 12.374f)
            lineTo(16.533f, 19.124f)
            curveTo(16.399f, 19.357f, 16.151f, 19.5f, 15.883f, 19.5f)
            horizontalLineTo(12.5f)
            curveTo(12.086f, 19.5f, 11.75f, 19.836f, 11.75f, 20.25f)
            curveTo(11.75f, 20.664f, 12.086f, 21f, 12.5f, 21f)
            horizontalLineTo(15.883f)
            curveTo(16.688f, 21f, 17.431f, 20.57f, 17.833f, 19.873f)
            lineTo(21.719f, 13.123f)
            curveTo(22.119f, 12.428f, 22.119f, 11.572f, 21.719f, 10.877f)
            lineTo(17.896f, 4.237f)
            curveTo(17.455f, 3.472f, 16.64f, 3f, 15.757f, 3f)
            curveTo(14.682f, 3f, 13.731f, 3.696f, 13.405f, 4.72f)
            lineTo(8.912f, 18.839f)
            curveTo(8.787f, 19.233f, 8.421f, 19.5f, 8.008f, 19.5f)
            curveTo(7.661f, 19.5f, 7.342f, 19.31f, 7.176f, 19.006f)
            lineTo(3.561f, 12.379f)
            curveTo(3.436f, 12.15f, 3.439f, 11.872f, 3.57f, 11.646f)
            lineTo(7.468f, 4.876f)
            curveTo(7.601f, 4.643f, 7.849f, 4.5f, 8.118f, 4.5f)
            horizontalLineTo(11.25f)
            curveTo(11.665f, 4.5f, 12f, 4.164f, 12f, 3.75f)
            curveTo(12f, 3.336f, 11.665f, 3f, 11.25f, 3f)
            horizontalLineTo(8.118f)
            curveTo(7.313f, 3f, 6.569f, 3.43f, 6.168f, 4.127f)
            lineTo(2.27f, 10.897f)
            curveTo(1.879f, 11.576f, 1.869f, 12.41f, 2.244f, 13.097f)
            lineTo(5.859f, 19.724f)
            curveTo(6.288f, 20.511f, 7.113f, 21f, 8.008f, 21f)
            curveTo(9.075f, 21f, 10.018f, 20.31f, 10.342f, 19.294f)
            lineTo(14.834f, 5.175f)
            curveTo(14.962f, 4.773f, 15.335f, 4.5f, 15.757f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AgentsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Agents, contentDescription = null)
    }
}
