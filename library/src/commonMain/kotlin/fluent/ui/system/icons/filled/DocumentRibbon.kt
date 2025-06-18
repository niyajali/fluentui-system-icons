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

public val FluentIcons.Filled.DocumentRibbon: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentRibbon",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8.001f)
            curveTo(12f, 9.105f, 12.895f, 10.001f, 14f, 10.001f)
            horizontalLineTo(20f)
            verticalLineTo(20.002f)
            curveTo(20f, 21.107f, 19.105f, 22.003f, 18f, 22.003f)
            horizontalLineTo(9f)
            verticalLineTo(18.331f)
            curveTo(9.625f, 17.558f, 10f, 16.573f, 10f, 15.502f)
            curveTo(10f, 13.016f, 7.985f, 11.001f, 5.5f, 11.001f)
            curveTo(4.974f, 11.001f, 4.469f, 11.091f, 4f, 11.257f)
            verticalLineTo(4f)
            curveTo(4f, 2.896f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8.001f)
            curveTo(13.5f, 8.277f, 13.724f, 8.501f, 14f, 8.501f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(9f, 15.502f)
            curveTo(9f, 17.435f, 7.433f, 19.002f, 5.5f, 19.002f)
            curveTo(3.567f, 19.002f, 2f, 17.435f, 2f, 15.502f)
            curveTo(2f, 13.568f, 3.567f, 12.001f, 5.5f, 12.001f)
            curveTo(7.433f, 12.001f, 9f, 13.568f, 9f, 15.502f)
            close()
            moveTo(3f, 19.244f)
            verticalLineTo(22.288f)
            curveTo(3f, 22.921f, 3.765f, 23.238f, 4.212f, 22.791f)
            lineTo(5.5f, 21.503f)
            lineTo(6.788f, 22.791f)
            curveTo(7.235f, 23.238f, 8f, 22.921f, 8f, 22.288f)
            verticalLineTo(19.244f)
            curveTo(7.285f, 19.723f, 6.425f, 20.002f, 5.5f, 20.002f)
            curveTo(4.575f, 20.002f, 3.715f, 19.723f, 3f, 19.244f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentRibbonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentRibbon, contentDescription = null)
    }
}
