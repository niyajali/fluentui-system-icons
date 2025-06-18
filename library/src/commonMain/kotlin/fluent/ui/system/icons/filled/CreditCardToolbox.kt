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

public val FluentIcons.Filled.CreditCardToolbox: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CreditCardToolbox",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5f, 22f, 6.455f, 22f, 8.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(2f)
            verticalLineTo(8.25f)
            close()
            moveTo(15.75f, 11f)
            horizontalLineTo(2f)
            verticalLineTo(15.75f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(11f)
            verticalLineTo(16.25f)
            curveTo(11f, 15.04f, 11.859f, 14.032f, 13f, 13.8f)
            verticalLineTo(13.75f)
            curveTo(13f, 12.231f, 14.231f, 11f, 15.75f, 11f)
            close()
            moveTo(13.5f, 14.75f)
            horizontalLineTo(14f)
            verticalLineTo(13.75f)
            curveTo(14f, 12.783f, 14.783f, 12f, 15.75f, 12f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 12f, 21f, 12.783f, 21f, 13.75f)
            verticalLineTo(14.75f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 14.75f, 23f, 15.422f, 23f, 16.25f)
            verticalLineTo(18f)
            horizontalLineTo(20f)
            verticalLineTo(17.5f)
            curveTo(20f, 17.224f, 19.776f, 17f, 19.5f, 17f)
            curveTo(19.224f, 17f, 19f, 17.224f, 19f, 17.5f)
            verticalLineTo(18f)
            horizontalLineTo(16f)
            verticalLineTo(17.5f)
            curveTo(16f, 17.224f, 15.776f, 17f, 15.5f, 17f)
            curveTo(15.224f, 17f, 15f, 17.224f, 15f, 17.5f)
            verticalLineTo(18f)
            horizontalLineTo(12f)
            verticalLineTo(16.25f)
            curveTo(12f, 15.422f, 12.672f, 14.75f, 13.5f, 14.75f)
            close()
            moveTo(15.75f, 13.5f)
            curveTo(15.612f, 13.5f, 15.5f, 13.612f, 15.5f, 13.75f)
            verticalLineTo(14.75f)
            horizontalLineTo(19.5f)
            verticalLineTo(13.75f)
            curveTo(19.5f, 13.612f, 19.388f, 13.5f, 19.25f, 13.5f)
            horizontalLineTo(15.75f)
            close()
            moveTo(19f, 19.5f)
            verticalLineTo(19f)
            horizontalLineTo(16f)
            verticalLineTo(19.5f)
            curveTo(16f, 19.776f, 15.776f, 20f, 15.5f, 20f)
            curveTo(15.224f, 20f, 15f, 19.776f, 15f, 19.5f)
            verticalLineTo(19f)
            horizontalLineTo(12f)
            verticalLineTo(21.5f)
            curveTo(12f, 22.328f, 12.672f, 23f, 13.5f, 23f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
            verticalLineTo(19f)
            horizontalLineTo(20f)
            verticalLineTo(19.5f)
            curveTo(20f, 19.776f, 19.776f, 20f, 19.5f, 20f)
            curveTo(19.224f, 20f, 19f, 19.776f, 19f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CreditCardToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CreditCardToolbox, contentDescription = null)
    }
}
