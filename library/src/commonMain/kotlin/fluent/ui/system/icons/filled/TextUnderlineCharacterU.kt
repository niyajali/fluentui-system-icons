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

public val FluentUi.Filled.TextUnderlineCharacterU: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextUnderlineCharacterU",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 5f)
            curveTo(9f, 4.448f, 8.552f, 4f, 8f, 4f)
            curveTo(7.448f, 4f, 7f, 4.448f, 7f, 5f)
            verticalLineTo(11.5f)
            curveTo(7f, 14.261f, 9.239f, 16.5f, 12f, 16.5f)
            curveTo(14.761f, 16.5f, 17f, 14.261f, 17f, 11.5f)
            verticalLineTo(5f)
            curveTo(17f, 4.448f, 16.552f, 4f, 16f, 4f)
            curveTo(15.448f, 4f, 15f, 4.448f, 15f, 5f)
            verticalLineTo(11.5f)
            curveTo(15f, 13.157f, 13.657f, 14.5f, 12f, 14.5f)
            curveTo(10.343f, 14.5f, 9f, 13.157f, 9f, 11.5f)
            verticalLineTo(5f)
            close()
            moveTo(7f, 18f)
            curveTo(6.448f, 18f, 6f, 18.448f, 6f, 19f)
            curveTo(6f, 19.552f, 6.448f, 20f, 7f, 20f)
            horizontalLineTo(17f)
            curveTo(17.552f, 20f, 18f, 19.552f, 18f, 19f)
            curveTo(18f, 18.448f, 17.552f, 18f, 17f, 18f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextUnderlineCharacterUPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextUnderlineCharacterU, contentDescription = null)
    }
}
