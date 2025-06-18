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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Comma: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Comma",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.62f, 12.023f)
            curveTo(13.918f, 12.632f, 13.002f, 13f, 12f, 13f)
            curveTo(9.791f, 13f, 8f, 11.209f, 8f, 9f)
            curveTo(8f, 6.791f, 9.791f, 5f, 12f, 5f)
            curveTo(14.053f, 5f, 15.745f, 6.547f, 15.974f, 8.539f)
            curveTo(16.33f, 10.35f, 16.326f, 12.506f, 15.51f, 14.439f)
            curveTo(14.648f, 16.48f, 12.909f, 18.198f, 9.94f, 18.976f)
            curveTo(9.539f, 19.08f, 9.129f, 18.841f, 9.024f, 18.44f)
            curveTo(8.92f, 18.039f, 9.159f, 17.629f, 9.56f, 17.524f)
            curveTo(12.091f, 16.862f, 13.452f, 15.455f, 14.128f, 13.856f)
            curveTo(14.375f, 13.272f, 14.533f, 12.653f, 14.62f, 12.023f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Comma, contentDescription = null)
    }
}
