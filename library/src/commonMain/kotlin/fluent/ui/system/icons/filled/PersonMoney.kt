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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.PersonMoney: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonMoney",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.754f, 14f)
            curveTo(18.534f, 14f, 19.222f, 14.397f, 19.625f, 15f)
            horizontalLineTo(13.5f)
            curveTo(12.12f, 15f, 11f, 16.119f, 11f, 17.5f)
            verticalLineTo(21.5f)
            curveTo(11f, 21.661f, 11.016f, 21.819f, 11.045f, 21.972f)
            curveTo(8.106f, 21.787f, 5.909f, 20.722f, 4.514f, 18.765f)
            curveTo(4.182f, 18.299f, 4.004f, 17.741f, 4.004f, 17.169f)
            verticalLineTo(16.249f)
            curveTo(4.004f, 15.007f, 5.011f, 14f, 6.253f, 14f)
            horizontalLineTo(17.754f)
            close()
            moveTo(12f, 2.005f)
            curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
            curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
            curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
            curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 16.672f, 12.672f, 16f, 13.5f, 16f)
            horizontalLineTo(21.5f)
            curveTo(22.329f, 16f, 23f, 16.672f, 23f, 17.5f)
            verticalLineTo(21.5f)
            curveTo(23f, 22.328f, 22.329f, 23f, 21.5f, 23f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 23f, 12f, 22.328f, 12f, 21.5f)
            verticalLineTo(17.5f)
            close()
            moveTo(22f, 18f)
            curveTo(21.448f, 18f, 21f, 17.552f, 21f, 17f)
            horizontalLineTo(20f)
            curveTo(20f, 18.105f, 20.896f, 19f, 22f, 19f)
            verticalLineTo(18f)
            close()
            moveTo(22f, 20f)
            curveTo(20.896f, 20f, 20f, 20.895f, 20f, 22f)
            horizontalLineTo(21f)
            curveTo(21f, 21.448f, 21.448f, 21f, 22f, 21f)
            verticalLineTo(20f)
            close()
            moveTo(14f, 17f)
            curveTo(14f, 17.552f, 13.552f, 18f, 13f, 18f)
            verticalLineTo(19f)
            curveTo(14.105f, 19f, 15f, 18.105f, 15f, 17f)
            horizontalLineTo(14f)
            close()
            moveTo(15f, 22f)
            curveTo(15f, 20.895f, 14.105f, 20f, 13f, 20f)
            verticalLineTo(21f)
            curveTo(13.552f, 21f, 14f, 21.448f, 14f, 22f)
            horizontalLineTo(15f)
            close()
            moveTo(19.25f, 19.5f)
            curveTo(19.25f, 18.534f, 18.467f, 17.75f, 17.5f, 17.75f)
            curveTo(16.534f, 17.75f, 15.75f, 18.534f, 15.75f, 19.5f)
            curveTo(15.75f, 20.466f, 16.534f, 21.25f, 17.5f, 21.25f)
            curveTo(18.467f, 21.25f, 19.25f, 20.466f, 19.25f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonMoneyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonMoney, contentDescription = null)
    }
}
