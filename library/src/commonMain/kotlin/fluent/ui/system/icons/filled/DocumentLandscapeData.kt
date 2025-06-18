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

public val FluentUi.Filled.DocumentLandscapeData: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentLandscapeData",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(22f, 18.769f, 20.769f, 20f, 19.25f, 20f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(12f, 7f)
            curveTo(10.895f, 7f, 10f, 7.895f, 10f, 9f)
            verticalLineTo(15f)
            curveTo(10f, 16.105f, 10.895f, 17f, 12f, 17f)
            curveTo(13.105f, 17f, 14f, 16.105f, 14f, 15f)
            verticalLineTo(9f)
            curveTo(14f, 7.895f, 13.105f, 7f, 12f, 7f)
            close()
            moveTo(7f, 12f)
            curveTo(5.895f, 12f, 5f, 12.895f, 5f, 14f)
            verticalLineTo(15f)
            curveTo(5f, 16.105f, 5.895f, 17f, 7f, 17f)
            curveTo(8.105f, 17f, 9f, 16.105f, 9f, 15f)
            verticalLineTo(14f)
            curveTo(9f, 12.895f, 8.105f, 12f, 7f, 12f)
            close()
            moveTo(15f, 12f)
            verticalLineTo(15f)
            curveTo(15f, 16.105f, 15.895f, 17f, 17f, 17f)
            curveTo(18.105f, 17f, 19f, 16.105f, 19f, 15f)
            verticalLineTo(12f)
            curveTo(19f, 10.895f, 18.105f, 10f, 17f, 10f)
            curveTo(15.895f, 10f, 15f, 10.895f, 15f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentLandscapeDataPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentLandscapeData, contentDescription = null)
    }
}
