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

public val FluentUi.Filled.MailTemplate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailTemplate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5f)
            curveTo(2f, 3.343f, 3.343f, 2f, 5f, 2f)
            horizontalLineTo(16f)
            curveTo(17.657f, 2f, 19f, 3.343f, 19f, 5f)
            verticalLineTo(10f)
            horizontalLineTo(10f)
            curveTo(7.791f, 10f, 6f, 11.791f, 6f, 14f)
            verticalLineTo(19f)
            curveTo(6f, 19.345f, 6.044f, 19.68f, 6.126f, 20f)
            horizontalLineTo(5f)
            curveTo(3.343f, 20f, 2f, 18.657f, 2f, 17f)
            verticalLineTo(5f)
            close()
            moveTo(5.75f, 4f)
            curveTo(5.336f, 4f, 5f, 4.336f, 5f, 4.75f)
            curveTo(5f, 5.164f, 5.336f, 5.5f, 5.75f, 5.5f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 5.5f, 16f, 5.164f, 16f, 4.75f)
            curveTo(16f, 4.336f, 15.664f, 4f, 15.25f, 4f)
            horizontalLineTo(5.75f)
            close()
            moveTo(7.75f, 7f)
            curveTo(7.336f, 7f, 7f, 7.336f, 7f, 7.75f)
            curveTo(7f, 8.164f, 7.336f, 8.5f, 7.75f, 8.5f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 8.5f, 16f, 8.164f, 16f, 7.75f)
            curveTo(16f, 7.336f, 15.664f, 7f, 15.25f, 7f)
            horizontalLineTo(7.75f)
            close()
            moveTo(7.548f, 12.271f)
            curveTo(8.092f, 11.502f, 8.987f, 11f, 10f, 11f)
            horizontalLineTo(19f)
            curveTo(20.013f, 11f, 20.908f, 11.502f, 21.452f, 12.271f)
            lineTo(14.5f, 16.615f)
            lineTo(7.548f, 12.271f)
            close()
            moveTo(7.014f, 13.706f)
            curveTo(7.005f, 13.802f, 7f, 13.901f, 7f, 14f)
            verticalLineTo(19f)
            curveTo(7f, 20.657f, 8.343f, 22f, 10f, 22f)
            horizontalLineTo(19f)
            curveTo(20.657f, 22f, 22f, 20.657f, 22f, 19f)
            verticalLineTo(14f)
            curveTo(22f, 13.901f, 21.995f, 13.802f, 21.986f, 13.706f)
            lineTo(14.898f, 18.136f)
            curveTo(14.654f, 18.288f, 14.346f, 18.288f, 14.102f, 18.136f)
            lineTo(7.014f, 13.706f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailTemplatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MailTemplate, contentDescription = null)
    }
}
