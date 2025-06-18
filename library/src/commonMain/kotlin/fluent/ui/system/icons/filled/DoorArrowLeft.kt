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

public val FluentUi.Filled.DoorArrowLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DoorArrowLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 2.75f)
            curveTo(5.422f, 2.75f, 4.75f, 3.422f, 4.75f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(4.75f, 20.578f, 5.422f, 21.25f, 6.25f, 21.25f)
            horizontalLineTo(12.19f)
            curveTo(11.441f, 20.191f, 11f, 18.897f, 11f, 17.5f)
            curveTo(11f, 13.91f, 13.91f, 11f, 17.5f, 11f)
            curveTo(18.106f, 11f, 18.693f, 11.083f, 19.25f, 11.238f)
            verticalLineTo(4.25f)
            curveTo(19.25f, 3.422f, 18.578f, 2.75f, 17.75f, 2.75f)
            horizontalLineTo(6.25f)
            close()
            moveTo(8.5f, 13.25f)
            curveTo(7.672f, 13.25f, 7f, 12.578f, 7f, 11.75f)
            curveTo(7f, 10.922f, 7.672f, 10.25f, 8.5f, 10.25f)
            curveTo(9.328f, 10.25f, 10f, 10.922f, 10f, 11.75f)
            curveTo(10f, 12.578f, 9.328f, 13.25f, 8.5f, 13.25f)
            close()
            moveTo(17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            close()
            moveTo(21f, 17.5f)
            curveTo(21f, 17.776f, 20.776f, 18f, 20.5f, 18f)
            horizontalLineTo(15.707f)
            lineTo(17.354f, 19.646f)
            curveTo(17.549f, 19.842f, 17.549f, 20.158f, 17.354f, 20.354f)
            curveTo(17.158f, 20.549f, 16.842f, 20.549f, 16.646f, 20.354f)
            lineTo(14.146f, 17.854f)
            curveTo(13.951f, 17.658f, 13.951f, 17.342f, 14.146f, 17.146f)
            lineTo(16.646f, 14.646f)
            curveTo(16.842f, 14.451f, 17.158f, 14.451f, 17.354f, 14.646f)
            curveTo(17.549f, 14.842f, 17.549f, 15.158f, 17.354f, 15.354f)
            lineTo(15.707f, 17f)
            horizontalLineTo(20.5f)
            curveTo(20.776f, 17f, 21f, 17.224f, 21f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DoorArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DoorArrowLeft, contentDescription = null)
    }
}
