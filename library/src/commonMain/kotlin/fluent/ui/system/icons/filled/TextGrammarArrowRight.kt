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

public val FluentUi.Filled.TextGrammarArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextGrammarArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 5f)
            horizontalLineTo(21f)
            curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
            curveTo(22f, 6.513f, 21.614f, 6.936f, 21.117f, 6.993f)
            lineTo(21f, 7f)
            horizontalLineTo(3f)
            curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
            curveTo(2f, 5.487f, 2.386f, 5.064f, 2.883f, 5.007f)
            lineTo(3f, 5f)
            close()
            moveTo(3f, 11f)
            curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
            curveTo(2f, 9.487f, 2.386f, 9.064f, 2.883f, 9.007f)
            lineTo(3f, 9f)
            horizontalLineTo(21f)
            curveTo(21.552f, 9f, 22f, 9.448f, 22f, 10f)
            curveTo(22f, 10.513f, 21.614f, 10.936f, 21.117f, 10.993f)
            lineTo(21f, 11f)
            horizontalLineTo(3f)
            close()
            moveTo(3f, 15f)
            horizontalLineTo(11.498f)
            curveTo(11.81f, 14.252f, 12.257f, 13.575f, 12.81f, 13f)
            horizontalLineTo(3f)
            lineTo(2.883f, 13.007f)
            curveTo(2.386f, 13.064f, 2f, 13.487f, 2f, 14f)
            curveTo(2f, 14.552f, 2.448f, 15f, 3f, 15f)
            close()
            moveTo(3f, 17f)
            horizontalLineTo(11.019f)
            curveTo(11.006f, 17.165f, 11f, 17.332f, 11f, 17.5f)
            curveTo(11f, 18.016f, 11.06f, 18.518f, 11.174f, 19f)
            horizontalLineTo(3f)
            curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
            curveTo(2f, 17.487f, 2.386f, 17.065f, 2.883f, 17.007f)
            lineTo(3f, 17f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(18.35f, 20.354f)
            lineTo(18.281f, 20.411f)
            curveTo(18.086f, 20.546f, 17.816f, 20.527f, 17.643f, 20.354f)
            lineTo(17.585f, 20.284f)
            curveTo(17.45f, 20.089f, 17.469f, 19.82f, 17.643f, 19.646f)
            lineTo(19.289f, 18f)
            lineTo(14.5f, 18f)
            lineTo(14.41f, 17.992f)
            curveTo(14.177f, 17.95f, 14f, 17.746f, 14f, 17.5f)
            lineTo(14.008f, 17.41f)
            curveTo(14.05f, 17.177f, 14.255f, 17f, 14.5f, 17f)
            lineTo(19.289f, 17f)
            lineTo(17.643f, 15.354f)
            lineTo(17.585f, 15.284f)
            curveTo(17.45f, 15.089f, 17.469f, 14.82f, 17.643f, 14.646f)
            curveTo(17.838f, 14.451f, 18.155f, 14.451f, 18.35f, 14.646f)
            lineTo(20.866f, 17.163f)
            lineTo(20.917f, 17.229f)
            lineTo(20.951f, 17.29f)
            lineTo(20.979f, 17.37f)
            lineTo(20.994f, 17.456f)
            lineTo(20.992f, 17.566f)
            lineTo(20.973f, 17.651f)
            lineTo(20.95f, 17.71f)
            lineTo(20.906f, 17.787f)
            lineTo(20.866f, 17.837f)
            lineTo(18.35f, 20.354f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextGrammarArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextGrammarArrowRight, contentDescription = null)
    }
}
