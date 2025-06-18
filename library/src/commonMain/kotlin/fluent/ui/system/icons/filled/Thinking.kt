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

public val FluentIcons.Filled.Thinking: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Thinking",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 18f)
            curveTo(5.105f, 18f, 6f, 18.895f, 6f, 20f)
            curveTo(6f, 21.105f, 5.105f, 22f, 4f, 22f)
            curveTo(2.895f, 22f, 2f, 21.105f, 2f, 20f)
            curveTo(2f, 18.895f, 2.895f, 18f, 4f, 18f)
            close()
            moveTo(9.5f, 15f)
            curveTo(10.881f, 15f, 12f, 16.119f, 12f, 17.5f)
            curveTo(12f, 18.881f, 10.881f, 20f, 9.5f, 20f)
            curveTo(8.119f, 20f, 7f, 18.881f, 7f, 17.5f)
            curveTo(7f, 16.119f, 8.119f, 15f, 9.5f, 15f)
            close()
            moveTo(12f, 2f)
            curveTo(14.659f, 2f, 16.884f, 3.923f, 17.33f, 6.471f)
            lineTo(17.412f, 6.471f)
            curveTo(19.491f, 6.471f, 21.177f, 8.156f, 21.177f, 10.235f)
            curveTo(21.177f, 12.314f, 19.491f, 14f, 17.412f, 14f)
            horizontalLineTo(6.588f)
            curveTo(4.509f, 14f, 2.824f, 12.314f, 2.824f, 10.235f)
            curveTo(2.824f, 8.156f, 4.509f, 6.471f, 6.588f, 6.471f)
            lineTo(6.67f, 6.471f)
            curveTo(7.116f, 3.923f, 9.341f, 2f, 12f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ThinkingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Thinking, contentDescription = null)
    }
}
