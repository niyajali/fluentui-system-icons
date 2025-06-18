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

public val FluentUi.Filled.MailReadMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailReadMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.359f, 1.842f)
            curveTo(11.135f, 1.719f, 10.865f, 1.719f, 10.641f, 1.842f)
            lineTo(2.83f, 6.102f)
            curveTo(2.662f, 6.194f, 2.516f, 6.312f, 2.394f, 6.451f)
            lineTo(11f, 11.146f)
            lineTo(19.606f, 6.451f)
            curveTo(19.484f, 6.312f, 19.338f, 6.194f, 19.17f, 6.102f)
            lineTo(11.359f, 1.842f)
            close()
            moveTo(2f, 15.75f)
            verticalLineTo(7.945f)
            lineTo(10.641f, 12.658f)
            curveTo(10.865f, 12.781f, 11.135f, 12.781f, 11.359f, 12.658f)
            lineTo(20f, 7.945f)
            verticalLineTo(15.75f)
            curveTo(20f, 17.545f, 18.545f, 19f, 16.75f, 19f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 19f, 2f, 17.545f, 2f, 15.75f)
            close()
            moveTo(21.001f, 7.511f)
            curveTo(21.903f, 8.089f, 22.5f, 9.1f, 22.5f, 10.25f)
            verticalLineTo(16.25f)
            curveTo(22.5f, 19.149f, 20.15f, 21.5f, 17.25f, 21.5f)
            horizontalLineTo(8.25f)
            curveTo(7.1f, 21.5f, 6.089f, 20.902f, 5.512f, 20f)
            lineTo(17.25f, 20f)
            curveTo(19.322f, 20f, 21f, 18.321f, 21f, 16.25f)
            lineTo(21.001f, 7.511f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailReadMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MailReadMultiple, contentDescription = null)
    }
}
