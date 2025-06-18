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

public val FluentIcons.Regular.BuildingRetail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BuildingRetail",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 8f)
            curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
            verticalLineTo(12.25f)
            curveTo(6f, 12.664f, 6.336f, 13f, 6.75f, 13f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 13f, 18f, 12.664f, 18f, 12.25f)
            verticalLineTo(8.75f)
            curveTo(18f, 8.336f, 17.664f, 8f, 17.25f, 8f)
            horizontalLineTo(6.75f)
            close()
            moveTo(7.5f, 11.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(11.5f)
            horizontalLineTo(7.5f)
            close()
            moveTo(13.75f, 14f)
            curveTo(13.336f, 14f, 13f, 14.336f, 13f, 14.75f)
            verticalLineTo(17.25f)
            curveTo(13f, 17.664f, 13.336f, 18f, 13.75f, 18f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 18f, 18f, 17.664f, 18f, 17.25f)
            verticalLineTo(14.75f)
            curveTo(18f, 14.336f, 17.664f, 14f, 17.25f, 14f)
            horizontalLineTo(13.75f)
            close()
            moveTo(14.5f, 16.5f)
            verticalLineTo(15.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(16.5f)
            horizontalLineTo(14.5f)
            close()
            moveTo(4f, 3f)
            curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
            curveTo(2f, 5.74f, 2.402f, 6.387f, 3f, 6.732f)
            verticalLineTo(20.25f)
            curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
            verticalLineTo(6.732f)
            curveTo(21.598f, 6.387f, 22f, 5.74f, 22f, 5f)
            curveTo(22f, 3.895f, 21.105f, 3f, 20f, 3f)
            horizontalLineTo(4f)
            close()
            moveTo(19.5f, 7f)
            verticalLineTo(19.5f)
            horizontalLineTo(11.5f)
            verticalLineTo(14.75f)
            curveTo(11.5f, 14.336f, 11.164f, 14f, 10.75f, 14f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
            verticalLineTo(19.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(7f)
            horizontalLineTo(19.5f)
            close()
            moveTo(3.5f, 5f)
            curveTo(3.5f, 4.724f, 3.724f, 4.5f, 4f, 4.5f)
            horizontalLineTo(20f)
            curveTo(20.276f, 4.5f, 20.5f, 4.724f, 20.5f, 5f)
            curveTo(20.5f, 5.276f, 20.276f, 5.5f, 20f, 5.5f)
            horizontalLineTo(4f)
            curveTo(3.724f, 5.5f, 3.5f, 5.276f, 3.5f, 5f)
            close()
            moveTo(10f, 19.5f)
            horizontalLineTo(7.5f)
            verticalLineTo(15.5f)
            horizontalLineTo(10f)
            verticalLineTo(19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingRetailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BuildingRetail, contentDescription = null)
    }
}
