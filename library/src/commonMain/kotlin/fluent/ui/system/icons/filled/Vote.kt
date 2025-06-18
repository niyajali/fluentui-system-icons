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

public val FluentIcons.Filled.Vote: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Vote",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.944f, 14.472f)
            lineTo(21.966f, 14.534f)
            lineTo(21.989f, 14.634f)
            lineTo(21.998f, 14.733f)
            verticalLineTo(21.25f)
            curveTo(21.998f, 21.63f, 21.716f, 21.944f, 21.35f, 21.993f)
            lineTo(21.248f, 22f)
            horizontalLineTo(2.75f)
            curveTo(2.37f, 22f, 2.057f, 21.718f, 2.007f, 21.352f)
            lineTo(2f, 21.25f)
            verticalLineTo(14.751f)
            lineTo(2.002f, 14.698f)
            lineTo(2.013f, 14.612f)
            curveTo(2.023f, 14.558f, 2.038f, 14.507f, 2.059f, 14.459f)
            lineTo(4.818f, 8.44f)
            curveTo(4.925f, 8.207f, 5.142f, 8.047f, 5.392f, 8.01f)
            lineTo(5.5f, 8.003f)
            lineTo(8.04f, 8.002f)
            lineTo(7.251f, 9.372f)
            lineTo(7.183f, 9.502f)
            lineTo(5.981f, 9.502f)
            lineTo(3.918f, 14f)
            horizontalLineTo(20.07f)
            lineTo(18.043f, 9.654f)
            lineTo(18.905f, 8.157f)
            curveTo(18.972f, 8.207f, 19.03f, 8.27f, 19.077f, 8.341f)
            lineTo(19.13f, 8.436f)
            lineTo(21.944f, 14.472f)
            close()
            moveTo(13.365f, 2.056f)
            lineTo(13.457f, 2.101f)
            lineTo(18.645f, 5.104f)
            curveTo(18.973f, 5.294f, 19.103f, 5.695f, 18.964f, 6.037f)
            lineTo(18.919f, 6.129f)
            lineTo(16.112f, 11.001f)
            lineTo(17.25f, 11.002f)
            curveTo(17.664f, 11.002f, 18f, 11.337f, 18f, 11.752f)
            curveTo(18f, 12.131f, 17.718f, 12.445f, 17.352f, 12.495f)
            lineTo(17.25f, 12.502f)
            lineTo(15.248f, 12.501f)
            lineTo(15.247f, 12.504f)
            horizontalLineTo(11.169f)
            lineTo(11.166f, 12.501f)
            lineTo(6.75f, 12.502f)
            curveTo(6.336f, 12.502f, 6f, 12.166f, 6f, 11.752f)
            curveTo(6f, 11.372f, 6.282f, 11.058f, 6.648f, 11.009f)
            lineTo(6.75f, 11.002f)
            lineTo(8.573f, 11.001f)
            lineTo(8.391f, 10.896f)
            curveTo(8.063f, 10.706f, 7.933f, 10.305f, 8.073f, 9.963f)
            lineTo(8.117f, 9.871f)
            lineTo(12.434f, 2.375f)
            curveTo(12.623f, 2.046f, 13.024f, 1.916f, 13.365f, 2.056f)
            close()
            moveTo(13.356f, 3.775f)
            lineTo(9.788f, 9.971f)
            lineTo(11.566f, 11.001f)
            horizontalLineTo(14.383f)
            lineTo(17.248f, 6.028f)
            lineTo(13.356f, 3.775f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Vote, contentDescription = null)
    }
}
