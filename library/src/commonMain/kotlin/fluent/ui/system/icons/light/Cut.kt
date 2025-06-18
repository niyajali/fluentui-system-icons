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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.Cut: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Cut",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.225f, 2.083f)
            curveTo(8.426f, 1.95f, 8.689f, 1.982f, 8.854f, 2.147f)
            lineTo(8.917f, 2.225f)
            lineTo(20.405f, 19.653f)
            curveTo(21.179f, 19.238f, 22.062f, 19f, 23f, 19f)
            curveTo(26.038f, 19f, 28.5f, 21.463f, 28.5f, 24.5f)
            curveTo(28.5f, 27.538f, 26.038f, 30f, 23f, 30f)
            curveTo(19.962f, 30f, 17.5f, 27.538f, 17.5f, 24.5f)
            curveTo(17.5f, 22.76f, 18.31f, 21.211f, 19.57f, 20.203f)
            lineTo(15.999f, 14.785f)
            lineTo(12.43f, 20.203f)
            curveTo(13.69f, 21.211f, 14.5f, 22.76f, 14.5f, 24.5f)
            curveTo(14.5f, 27.538f, 12.038f, 30f, 9f, 30f)
            curveTo(5.963f, 30f, 3.5f, 27.538f, 3.5f, 24.5f)
            curveTo(3.5f, 21.463f, 5.963f, 19f, 9f, 19f)
            curveTo(9.938f, 19f, 10.821f, 19.238f, 11.595f, 19.653f)
            lineTo(15.4f, 13.877f)
            lineTo(8.083f, 2.776f)
            lineTo(8.035f, 2.686f)
            curveTo(7.949f, 2.47f, 8.023f, 2.216f, 8.225f, 2.083f)
            close()
            moveTo(9f, 20f)
            curveTo(6.515f, 20f, 4.5f, 22.015f, 4.5f, 24.5f)
            curveTo(4.5f, 26.985f, 6.515f, 29f, 9f, 29f)
            curveTo(11.485f, 29f, 13.5f, 26.985f, 13.5f, 24.5f)
            curveTo(13.5f, 23.029f, 12.794f, 21.721f, 11.7f, 20.9f)
            lineTo(11.477f, 20.743f)
            curveTo(10.767f, 20.274f, 9.916f, 20f, 9f, 20f)
            close()
            moveTo(23f, 20f)
            curveTo(22.084f, 20f, 21.233f, 20.274f, 20.523f, 20.743f)
            lineTo(20.3f, 20.9f)
            curveTo(19.206f, 21.721f, 18.5f, 23.029f, 18.5f, 24.5f)
            curveTo(18.5f, 26.985f, 20.515f, 29f, 23f, 29f)
            curveTo(25.485f, 29f, 27.5f, 26.985f, 27.5f, 24.5f)
            curveTo(27.5f, 22.015f, 25.485f, 20f, 23f, 20f)
            close()
            moveTo(23.146f, 2.147f)
            curveTo(23.311f, 1.982f, 23.574f, 1.951f, 23.775f, 2.083f)
            curveTo(23.977f, 2.216f, 24.051f, 2.47f, 23.965f, 2.686f)
            lineTo(23.917f, 2.776f)
            lineTo(17.197f, 12.97f)
            lineTo(16.598f, 12.062f)
            lineTo(23.083f, 2.225f)
            lineTo(23.146f, 2.147f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Cut, contentDescription = null)
    }
}
