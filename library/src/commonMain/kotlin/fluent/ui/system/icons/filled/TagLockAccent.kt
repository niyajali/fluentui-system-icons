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

public val FluentUi.Filled.TagLockAccent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagLockAccent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.75f, 2.5f)
            curveTo(20.214f, 2.501f, 20.659f, 2.685f, 20.987f, 3.013f)
            curveTo(21.315f, 3.341f, 21.5f, 3.786f, 21.5f, 4.25f)
            verticalLineTo(9.712f)
            curveTo(21.502f, 10.073f, 21.432f, 10.43f, 21.295f, 10.764f)
            curveTo(21.158f, 11.098f, 20.955f, 11.401f, 20.7f, 11.656f)
            lineTo(20.366f, 11.991f)
            curveTo(19.733f, 11.089f, 18.685f, 10.5f, 17.5f, 10.5f)
            curveTo(15.567f, 10.5f, 14f, 12.067f, 14f, 14f)
            verticalLineTo(14.05f)
            curveTo(12.859f, 14.282f, 12f, 15.29f, 12f, 16.5f)
            verticalLineTo(20.337f)
            curveTo(11.51f, 20.739f, 10.894f, 20.961f, 10.255f, 20.961f)
            curveTo(9.526f, 20.961f, 8.827f, 20.671f, 8.31f, 20.156f)
            lineTo(3.842f, 15.705f)
            curveTo(3.587f, 15.45f, 3.385f, 15.147f, 3.246f, 14.813f)
            curveTo(3.108f, 14.48f, 3.037f, 14.122f, 3.037f, 13.761f)
            curveTo(3.037f, 13.4f, 3.108f, 13.042f, 3.246f, 12.709f)
            curveTo(3.385f, 12.375f, 3.587f, 12.072f, 3.842f, 11.817f)
            lineTo(12.342f, 3.307f)
            curveTo(12.597f, 3.051f, 12.899f, 2.847f, 13.233f, 2.709f)
            curveTo(13.566f, 2.57f, 13.924f, 2.499f, 14.285f, 2.5f)
            horizontalLineTo(19.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TagLockAccentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TagLockAccent, contentDescription = null)
    }
}
