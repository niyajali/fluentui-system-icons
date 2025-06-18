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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.CalendarToolbox: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarToolbox",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 16.5f)
            verticalLineTo(21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(21f)
            verticalLineTo(11.879f)
            curveTo(20.524f, 11.486f, 19.915f, 11.25f, 19.25f, 11.25f)
            lineTo(15.602f, 11.254f)
            curveTo(14.152f, 11.331f, 13f, 12.531f, 13f, 14f)
            verticalLineTo(14.05f)
            curveTo(11.859f, 14.282f, 11f, 15.29f, 11f, 16.5f)
            close()
            moveTo(21f, 6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(21f)
            verticalLineTo(6.25f)
            close()
            moveTo(14f, 15f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 15f, 12f, 15.672f, 12f, 16.5f)
            verticalLineTo(18f)
            horizontalLineTo(14.5f)
            verticalLineTo(17.75f)
            curveTo(14.5f, 17.336f, 14.836f, 17f, 15.25f, 17f)
            curveTo(15.664f, 17f, 16f, 17.336f, 16f, 17.75f)
            verticalLineTo(18f)
            horizontalLineTo(19f)
            verticalLineTo(17.75f)
            curveTo(19f, 17.336f, 19.336f, 17f, 19.75f, 17f)
            curveTo(20.164f, 17f, 20.5f, 17.336f, 20.5f, 17.75f)
            verticalLineTo(18f)
            horizontalLineTo(23f)
            verticalLineTo(16.5f)
            curveTo(23f, 15.672f, 22.328f, 15f, 21.5f, 15f)
            horizontalLineTo(21f)
            verticalLineTo(14f)
            curveTo(21f, 13.033f, 20.216f, 12.25f, 19.25f, 12.25f)
            horizontalLineTo(15.75f)
            curveTo(14.783f, 12.25f, 14f, 13.033f, 14f, 14f)
            verticalLineTo(15f)
            close()
            moveTo(15.5f, 14f)
            curveTo(15.5f, 13.862f, 15.612f, 13.75f, 15.75f, 13.75f)
            horizontalLineTo(19.25f)
            curveTo(19.388f, 13.75f, 19.5f, 13.862f, 19.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(15.5f)
            verticalLineTo(14f)
            close()
            moveTo(12f, 21.5f)
            verticalLineTo(19.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(20.25f)
            curveTo(14.5f, 20.664f, 14.836f, 21f, 15.25f, 21f)
            curveTo(15.664f, 21f, 16f, 20.664f, 16f, 20.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(19f)
            verticalLineTo(20.25f)
            curveTo(19f, 20.664f, 19.336f, 21f, 19.75f, 21f)
            curveTo(20.164f, 21f, 20.5f, 20.664f, 20.5f, 20.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(23f)
            verticalLineTo(21.5f)
            curveTo(23f, 22.328f, 22.328f, 23f, 21.5f, 23f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 23f, 12f, 22.328f, 12f, 21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarToolbox, contentDescription = null)
    }
}
