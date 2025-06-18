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

public val FluentIcons.Filled.DatabaseArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DatabaseArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 10f)
            curveTo(16.418f, 10f, 20f, 8.209f, 20f, 6f)
            curveTo(20f, 3.791f, 16.418f, 2f, 12f, 2f)
            curveTo(7.582f, 2f, 4f, 3.791f, 4f, 6f)
            curveTo(4f, 8.209f, 7.582f, 10f, 12f, 10f)
            close()
            moveTo(18.328f, 10.17f)
            curveTo(18.916f, 9.876f, 19.498f, 9.504f, 20f, 9.053f)
            verticalLineTo(11.498f)
            curveTo(19.23f, 11.177f, 18.386f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 19.237f, 11.681f, 20.815f, 12.791f, 21.981f)
            curveTo(12.531f, 21.993f, 12.267f, 22f, 12f, 22f)
            curveTo(7.582f, 22f, 4f, 20.209f, 4f, 18f)
            verticalLineTo(9.053f)
            curveTo(4.502f, 9.504f, 5.084f, 9.876f, 5.672f, 10.17f)
            curveTo(7.369f, 11.019f, 9.608f, 11.5f, 12f, 11.5f)
            curveTo(14.392f, 11.5f, 16.631f, 11.019f, 18.328f, 10.17f)
            close()
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(14.5f, 17f)
            curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
            curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
            horizontalLineTo(19.293f)
            lineTo(17.646f, 19.646f)
            curveTo(17.451f, 19.842f, 17.451f, 20.158f, 17.646f, 20.354f)
            curveTo(17.842f, 20.549f, 18.158f, 20.549f, 18.354f, 20.354f)
            lineTo(20.854f, 17.854f)
            curveTo(21.049f, 17.658f, 21.049f, 17.342f, 20.854f, 17.146f)
            lineTo(18.354f, 14.646f)
            curveTo(18.158f, 14.451f, 17.842f, 14.451f, 17.646f, 14.646f)
            curveTo(17.451f, 14.842f, 17.451f, 15.158f, 17.646f, 15.354f)
            lineTo(19.293f, 17f)
            horizontalLineTo(14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DatabaseArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DatabaseArrowRight, contentDescription = null)
    }
}
