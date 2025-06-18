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

public val FluentUi.Filled.TextGrammarArrowLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextGrammarArrowLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(16.719f, 14.589f)
            lineTo(16.65f, 14.646f)
            lineTo(14.134f, 17.163f)
            lineTo(14.094f, 17.213f)
            lineTo(14.05f, 17.29f)
            lineTo(14.027f, 17.349f)
            lineTo(14.008f, 17.434f)
            lineTo(14.005f, 17.544f)
            lineTo(14.021f, 17.63f)
            lineTo(14.05f, 17.71f)
            lineTo(14.083f, 17.771f)
            lineTo(14.134f, 17.837f)
            lineTo(16.65f, 20.354f)
            curveTo(16.845f, 20.549f, 17.162f, 20.549f, 17.357f, 20.354f)
            curveTo(17.531f, 20.18f, 17.55f, 19.911f, 17.415f, 19.716f)
            lineTo(17.357f, 19.646f)
            lineTo(15.711f, 18f)
            horizontalLineTo(20.5f)
            curveTo(20.746f, 18f, 20.95f, 17.823f, 20.992f, 17.59f)
            lineTo(21f, 17.5f)
            curveTo(21f, 17.254f, 20.823f, 17.05f, 20.59f, 17.008f)
            lineTo(20.5f, 17f)
            horizontalLineTo(15.711f)
            lineTo(17.357f, 15.354f)
            curveTo(17.531f, 15.18f, 17.55f, 14.911f, 17.415f, 14.716f)
            lineTo(17.357f, 14.646f)
            curveTo(17.184f, 14.473f, 16.914f, 14.454f, 16.719f, 14.589f)
            close()
            moveTo(11.019f, 17f)
            horizontalLineTo(3f)
            lineTo(2.883f, 17.007f)
            curveTo(2.386f, 17.065f, 2f, 17.487f, 2f, 18f)
            curveTo(2f, 18.552f, 2.448f, 19f, 3f, 19f)
            horizontalLineTo(11.174f)
            curveTo(11.06f, 18.518f, 11f, 18.016f, 11f, 17.5f)
            curveTo(11f, 17.332f, 11.006f, 17.165f, 11.019f, 17f)
            close()
            moveTo(11.498f, 15f)
            horizontalLineTo(3f)
            curveTo(2.448f, 15f, 2f, 14.552f, 2f, 14f)
            curveTo(2f, 13.487f, 2.386f, 13.064f, 2.883f, 13.007f)
            lineTo(3f, 13f)
            horizontalLineTo(12.81f)
            curveTo(12.257f, 13.575f, 11.81f, 14.252f, 11.498f, 15f)
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
            moveTo(21f, 5f)
            horizontalLineTo(3f)
            lineTo(2.883f, 5.007f)
            curveTo(2.386f, 5.064f, 2f, 5.487f, 2f, 6f)
            curveTo(2f, 6.552f, 2.448f, 7f, 3f, 7f)
            horizontalLineTo(21f)
            lineTo(21.117f, 6.993f)
            curveTo(21.614f, 6.936f, 22f, 6.513f, 22f, 6f)
            curveTo(22f, 5.448f, 21.552f, 5f, 21f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextGrammarArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextGrammarArrowLeft, contentDescription = null)
    }
}
