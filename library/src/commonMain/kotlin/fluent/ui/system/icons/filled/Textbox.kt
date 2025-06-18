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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.Textbox: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Textbox",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 5.75f)
            curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(18.25f)
            curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(14.25f, 11.5f)
            curveTo(14.664f, 11.5f, 15f, 11.836f, 15f, 12.25f)
            curveTo(15f, 12.63f, 14.718f, 12.943f, 14.352f, 12.993f)
            lineTo(14.25f, 13f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 13f, 6f, 12.664f, 6f, 12.25f)
            curveTo(6f, 11.87f, 6.282f, 11.557f, 6.648f, 11.507f)
            lineTo(6.75f, 11.5f)
            horizontalLineTo(14.25f)
            close()
            moveTo(6.75f, 15.5f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 15.5f, 18f, 15.836f, 18f, 16.25f)
            curveTo(18f, 16.63f, 17.718f, 16.944f, 17.352f, 16.993f)
            lineTo(17.25f, 17f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 17f, 6f, 16.664f, 6f, 16.25f)
            curveTo(6f, 15.87f, 6.282f, 15.557f, 6.648f, 15.507f)
            lineTo(6.75f, 15.5f)
            close()
            moveTo(17.25f, 7.5f)
            curveTo(17.664f, 7.5f, 18f, 7.836f, 18f, 8.25f)
            curveTo(18f, 8.63f, 17.718f, 8.943f, 17.352f, 8.993f)
            lineTo(17.25f, 9f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 9f, 6f, 8.664f, 6f, 8.25f)
            curveTo(6f, 7.87f, 6.282f, 7.557f, 6.648f, 7.507f)
            lineTo(6.75f, 7.5f)
            horizontalLineTo(17.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Textbox, contentDescription = null)
    }
}
