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

public val FluentIcons.Filled.Storage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Storage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5f, 7f)
            horizontalLineTo(19f)
            curveTo(20.598f, 7f, 21.904f, 8.249f, 21.995f, 9.824f)
            lineTo(22f, 10f)
            verticalLineTo(14f)
            curveTo(22f, 15.598f, 20.751f, 16.904f, 19.176f, 16.995f)
            lineTo(19f, 17f)
            horizontalLineTo(5f)
            curveTo(3.402f, 17f, 2.096f, 15.751f, 2.005f, 14.176f)
            lineTo(2f, 14f)
            verticalLineTo(10f)
            curveTo(2f, 8.402f, 3.249f, 7.096f, 4.824f, 7.005f)
            lineTo(5f, 7f)
            horizontalLineTo(19f)
            horizontalLineTo(5f)
            close()
            moveTo(18f, 10f)
            curveTo(17.448f, 10f, 17f, 10.448f, 17f, 11f)
            curveTo(17f, 11.552f, 17.448f, 12f, 18f, 12f)
            curveTo(18.552f, 12f, 19f, 11.552f, 19f, 11f)
            curveTo(19f, 10.448f, 18.552f, 10f, 18f, 10f)
            close()
            moveTo(14f, 10f)
            curveTo(13.448f, 10f, 13f, 10.448f, 13f, 11f)
            curveTo(13f, 11.552f, 13.448f, 12f, 14f, 12f)
            curveTo(14.552f, 12f, 15f, 11.552f, 15f, 11f)
            curveTo(15f, 10.448f, 14.552f, 10f, 14f, 10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StoragePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Storage, contentDescription = null)
    }
}
