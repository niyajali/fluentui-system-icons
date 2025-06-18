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

public val FluentUi.Filled.NotebookSectionArrowRight: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.NotebookSectionArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.648f, 2.007f)
                lineTo(15.75f, 2f)
                curveTo(16.13f, 2f, 16.444f, 2.282f, 16.493f, 2.648f)
                lineTo(16.5f, 2.75f)
                verticalLineTo(11.077f)
                curveTo(13.385f, 11.558f, 11f, 14.25f, 11f, 17.5f)
                curveTo(11f, 18.385f, 11.177f, 19.228f, 11.497f, 19.996f)
                lineTo(9.25f, 19.996f)
                curveTo(8.007f, 19.996f, 7f, 18.989f, 7f, 17.746f)
                verticalLineTo(6.25f)
                curveTo(7f, 5.007f, 8.007f, 4f, 9.25f, 4f)
                lineTo(15f, 3.999f)
                verticalLineTo(2.75f)
                curveTo(15f, 2.37f, 15.282f, 2.057f, 15.648f, 2.007f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.463f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
                close()
                moveTo(14.5f, 17f)
                curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
                curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
                horizontalLineTo(19.293f)
                lineTo(17.646f, 19.647f)
                curveTo(17.451f, 19.842f, 17.451f, 20.159f, 17.646f, 20.354f)
                curveTo(17.842f, 20.549f, 18.158f, 20.549f, 18.354f, 20.354f)
                lineTo(20.854f, 17.854f)
                curveTo(21.049f, 17.659f, 21.049f, 17.342f, 20.854f, 17.147f)
                lineTo(18.354f, 14.647f)
                curveTo(18.158f, 14.451f, 17.842f, 14.451f, 17.646f, 14.647f)
                curveTo(17.451f, 14.842f, 17.451f, 15.159f, 17.646f, 15.354f)
                lineTo(19.293f, 17f)
                lineTo(14.5f, 17f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun NotebookSectionArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.NotebookSectionArrowRight, contentDescription = null)
    }
}
