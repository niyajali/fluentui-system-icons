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

public val FluentUi.Regular.Crown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Crown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 17f)
            curveTo(13.105f, 17f, 14f, 16.105f, 14f, 15f)
            curveTo(14f, 13.895f, 13.105f, 13f, 12f, 13f)
            curveTo(10.895f, 13f, 10f, 13.895f, 10f, 15f)
            curveTo(10f, 16.105f, 10.895f, 17f, 12f, 17f)
            close()
            moveTo(14f, 5f)
            curveTo(14f, 5.53f, 13.794f, 6.012f, 13.457f, 6.37f)
            lineTo(16.081f, 9.65f)
            curveTo(16.154f, 9.742f, 16.282f, 9.77f, 16.388f, 9.718f)
            lineTo(19.038f, 8.392f)
            curveTo(19.013f, 8.265f, 19f, 8.134f, 19f, 8f)
            curveTo(19f, 6.895f, 19.895f, 6f, 21f, 6f)
            curveTo(22.105f, 6f, 23f, 6.895f, 23f, 8f)
            curveTo(23f, 8.952f, 22.335f, 9.748f, 21.444f, 9.95f)
            lineTo(19.64f, 19.573f)
            curveTo(19.485f, 20.4f, 18.762f, 21f, 17.92f, 21f)
            horizontalLineTo(6.08f)
            curveTo(5.238f, 21f, 4.515f, 20.4f, 4.36f, 19.573f)
            lineTo(2.556f, 9.95f)
            curveTo(1.665f, 9.748f, 1f, 8.952f, 1f, 8f)
            curveTo(1f, 6.895f, 1.895f, 6f, 3f, 6f)
            curveTo(4.105f, 6f, 5f, 6.895f, 5f, 8f)
            curveTo(5f, 8.134f, 4.987f, 8.265f, 4.962f, 8.392f)
            lineTo(7.612f, 9.718f)
            curveTo(7.718f, 9.77f, 7.846f, 9.742f, 7.919f, 9.65f)
            lineTo(10.543f, 6.37f)
            curveTo(10.206f, 6.012f, 10f, 5.53f, 10f, 5f)
            curveTo(10f, 3.895f, 10.895f, 3f, 12f, 3f)
            curveTo(13.105f, 3f, 14f, 3.895f, 14f, 5f)
            close()
            moveTo(12f, 7f)
            curveTo(11.987f, 7f, 11.974f, 7f, 11.961f, 7f)
            lineTo(9.091f, 10.587f)
            curveTo(8.575f, 11.232f, 7.68f, 11.428f, 6.942f, 11.059f)
            lineTo(4.127f, 9.652f)
            curveTo(4.098f, 9.672f, 4.068f, 9.692f, 4.037f, 9.711f)
            lineTo(5.834f, 19.296f)
            curveTo(5.856f, 19.414f, 5.96f, 19.5f, 6.08f, 19.5f)
            horizontalLineTo(17.92f)
            curveTo(18.04f, 19.5f, 18.144f, 19.414f, 18.166f, 19.296f)
            lineTo(19.963f, 9.711f)
            curveTo(19.932f, 9.692f, 19.902f, 9.672f, 19.873f, 9.652f)
            lineTo(17.059f, 11.059f)
            curveTo(16.32f, 11.428f, 15.425f, 11.232f, 14.909f, 10.587f)
            lineTo(12.039f, 7f)
            curveTo(12.026f, 7f, 12.013f, 7f, 12f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CrownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Crown, contentDescription = null)
    }
}
