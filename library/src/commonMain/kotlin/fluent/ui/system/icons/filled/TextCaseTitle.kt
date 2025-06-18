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

public val FluentUi.Filled.TextCaseTitle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextCaseTitle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.443f, 3.416f)
            curveTo(8.303f, 3.022f, 7.933f, 2.756f, 7.514f, 2.75f)
            curveTo(7.096f, 2.744f, 6.719f, 2.999f, 6.568f, 3.389f)
            lineTo(0.568f, 18.889f)
            curveTo(0.368f, 19.404f, 0.624f, 19.983f, 1.139f, 20.183f)
            curveTo(1.654f, 20.382f, 2.233f, 20.126f, 2.433f, 19.611f)
            lineTo(3.831f, 16f)
            lineTo(10.786f, 16f)
            lineTo(12.058f, 19.584f)
            curveTo(12.243f, 20.105f, 12.814f, 20.377f, 13.335f, 20.192f)
            curveTo(13.855f, 20.008f, 14.127f, 19.436f, 13.943f, 18.916f)
            lineTo(8.443f, 3.416f)
            close()
            moveTo(4.605f, 14f)
            lineTo(7.459f, 6.625f)
            lineTo(10.076f, 14f)
            lineTo(4.605f, 14f)
            close()
            moveTo(16f, 3f)
            curveTo(16.552f, 3f, 17f, 3.448f, 17f, 4f)
            verticalLineTo(11.619f)
            curveTo(17.588f, 11.225f, 18.271f, 11f, 19f, 11f)
            curveTo(21.209f, 11f, 23f, 13.071f, 23f, 15.625f)
            curveTo(23f, 18.179f, 21.209f, 20.25f, 19f, 20.25f)
            curveTo(18.247f, 20.25f, 17.542f, 20.009f, 16.941f, 19.591f)
            curveTo(16.801f, 19.975f, 16.433f, 20.25f, 16f, 20.25f)
            curveTo(15.448f, 20.25f, 15f, 19.802f, 15f, 19.25f)
            verticalLineTo(4f)
            curveTo(15f, 3.448f, 15.448f, 3f, 16f, 3f)
            close()
            moveTo(19f, 18.25f)
            curveTo(19.842f, 18.25f, 21f, 17.357f, 21f, 15.625f)
            curveTo(21f, 13.893f, 19.842f, 13f, 19f, 13f)
            curveTo(18.158f, 13f, 17f, 13.893f, 17f, 15.625f)
            curveTo(17f, 17.357f, 18.158f, 18.25f, 19f, 18.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextCaseTitlePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextCaseTitle, contentDescription = null)
    }
}
