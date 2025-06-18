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

public val FluentIcons.Filled.DocumentTable: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentTable",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.5f, 13.25f)
            curveTo(8.5f, 13.112f, 8.612f, 13f, 8.75f, 13f)
            horizontalLineTo(10f)
            verticalLineTo(14.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(13.25f)
            close()
            moveTo(8.5f, 16f)
            horizontalLineTo(10f)
            verticalLineTo(17.5f)
            horizontalLineTo(8.75f)
            curveTo(8.612f, 17.5f, 8.5f, 17.388f, 8.5f, 17.25f)
            verticalLineTo(16f)
            close()
            moveTo(15.5f, 17.25f)
            verticalLineTo(16f)
            horizontalLineTo(11.5f)
            verticalLineTo(17.5f)
            horizontalLineTo(15.25f)
            curveTo(15.388f, 17.5f, 15.5f, 17.388f, 15.5f, 17.25f)
            close()
            moveTo(11.5f, 13f)
            verticalLineTo(14.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(13.25f)
            curveTo(15.5f, 13.112f, 15.388f, 13f, 15.25f, 13f)
            horizontalLineTo(11.5f)
            close()
            moveTo(12f, 8f)
            verticalLineTo(2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(20f)
            curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
            close()
            moveTo(8.75f, 11.5f)
            horizontalLineTo(15.25f)
            curveTo(16.216f, 11.5f, 17f, 12.283f, 17f, 13.25f)
            verticalLineTo(17.25f)
            curveTo(17f, 18.216f, 16.216f, 19f, 15.25f, 19f)
            horizontalLineTo(8.75f)
            curveTo(7.784f, 19f, 7f, 18.216f, 7f, 17.25f)
            verticalLineTo(13.25f)
            curveTo(7f, 12.283f, 7.784f, 11.5f, 8.75f, 11.5f)
            close()
            moveTo(13.5f, 8f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentTablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentTable, contentDescription = null)
    }
}
