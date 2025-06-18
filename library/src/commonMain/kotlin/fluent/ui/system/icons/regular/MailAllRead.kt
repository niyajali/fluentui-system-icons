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

public val FluentUi.Regular.MailAllRead: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailAllRead",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.359f, 1.842f)
            curveTo(11.135f, 1.719f, 10.865f, 1.719f, 10.641f, 1.842f)
            lineTo(2.83f, 6.102f)
            curveTo(2.318f, 6.381f, 2f, 6.917f, 2f, 7.5f)
            verticalLineTo(15.75f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 19f, 20f, 17.545f, 20f, 15.75f)
            verticalLineTo(7.5f)
            curveTo(20f, 6.917f, 19.682f, 6.381f, 19.17f, 6.102f)
            lineTo(11.359f, 1.842f)
            close()
            moveTo(11f, 11.146f)
            lineTo(3.858f, 7.25f)
            lineTo(11f, 3.354f)
            lineTo(18.142f, 7.25f)
            lineTo(11f, 11.146f)
            close()
            moveTo(11.359f, 12.658f)
            lineTo(18.5f, 8.763f)
            verticalLineTo(15.75f)
            curveTo(18.5f, 16.716f, 17.716f, 17.5f, 16.75f, 17.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 17.5f, 3.5f, 16.716f, 3.5f, 15.75f)
            verticalLineTo(8.763f)
            lineTo(10.641f, 12.658f)
            curveTo(10.865f, 12.781f, 11.135f, 12.781f, 11.359f, 12.658f)
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
private fun MailAllReadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MailAllRead, contentDescription = null)
    }
}
