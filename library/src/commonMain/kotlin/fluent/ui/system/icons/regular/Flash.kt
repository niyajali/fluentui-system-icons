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

public val FluentUi.Regular.Flash: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flash",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.425f, 2.831f)
            curveTo(7.602f, 2.333f, 8.074f, 2f, 8.603f, 2f)
            horizontalLineTo(15.056f)
            curveTo(15.909f, 2f, 16.512f, 2.836f, 16.242f, 3.645f)
            lineTo(14.79f, 8f)
            horizontalLineTo(18.749f)
            curveTo(19.853f, 8f, 20.415f, 9.327f, 19.647f, 10.12f)
            lineTo(8.586f, 21.536f)
            curveTo(7.532f, 22.624f, 5.714f, 21.642f, 6.045f, 20.164f)
            lineTo(7.314f, 14.496f)
            lineTo(5.746f, 14.49f)
            curveTo(4.539f, 14.486f, 3.699f, 13.29f, 4.104f, 12.153f)
            lineTo(7.425f, 2.831f)
            close()
            moveTo(8.779f, 3.5f)
            lineTo(5.517f, 12.656f)
            curveTo(5.459f, 12.819f, 5.579f, 12.99f, 5.751f, 12.99f)
            lineTo(8.253f, 13f)
            curveTo(8.48f, 13.001f, 8.695f, 13.105f, 8.836f, 13.282f)
            curveTo(8.978f, 13.46f, 9.031f, 13.692f, 8.982f, 13.914f)
            lineTo(7.509f, 20.492f)
            lineTo(18.159f, 9.5f)
            horizontalLineTo(13.75f)
            curveTo(13.509f, 9.5f, 13.282f, 9.384f, 13.142f, 9.189f)
            curveTo(13f, 8.993f, 12.962f, 8.742f, 13.038f, 8.513f)
            lineTo(14.709f, 3.5f)
            horizontalLineTo(8.779f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlashPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Flash, contentDescription = null)
    }
}
