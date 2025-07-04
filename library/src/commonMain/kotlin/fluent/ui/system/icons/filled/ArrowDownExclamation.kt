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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.ArrowDownExclamation: ImageVector
    get() {
        if (_ArrowDownExclamation != null) {
            return _ArrowDownExclamation!!
        }
        _ArrowDownExclamation = ImageVector.Builder(
            name = "Filled.ArrowDownExclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 2.75f)
                curveTo(18f, 2.336f, 17.664f, 2f, 17.25f, 2f)
                curveTo(16.836f, 2f, 16.5f, 2.336f, 16.5f, 2.75f)
                verticalLineTo(19.439f)
                lineTo(14.28f, 17.22f)
                curveTo(13.987f, 16.927f, 13.513f, 16.927f, 13.22f, 17.22f)
                curveTo(12.927f, 17.513f, 12.927f, 17.987f, 13.22f, 18.28f)
                lineTo(16.72f, 21.78f)
                curveTo(17.013f, 22.073f, 17.487f, 22.073f, 17.78f, 21.78f)
                lineTo(21.28f, 18.28f)
                curveTo(21.573f, 17.987f, 21.573f, 17.513f, 21.28f, 17.22f)
                curveTo(20.987f, 16.927f, 20.513f, 16.927f, 20.22f, 17.22f)
                lineTo(18f, 19.439f)
                verticalLineTo(2.75f)
                close()
                moveTo(3.125f, 5.877f)
                curveTo(3.125f, 3.737f, 4.86f, 2.002f, 7f, 2.002f)
                curveTo(9.141f, 2.002f, 10.876f, 3.737f, 10.876f, 5.877f)
                curveTo(10.876f, 8.827f, 9.671f, 12.441f, 9.065f, 14.081f)
                curveTo(8.741f, 14.957f, 7.906f, 15.5f, 7.003f, 15.5f)
                curveTo(6.097f, 15.5f, 5.261f, 14.954f, 4.938f, 14.076f)
                curveTo(4.332f, 12.429f, 3.125f, 8.796f, 3.125f, 5.877f)
                close()
                moveTo(4.5f, 19.502f)
                curveTo(4.5f, 18.121f, 5.62f, 17.001f, 7.001f, 17.001f)
                curveTo(8.382f, 17.001f, 9.502f, 18.121f, 9.502f, 19.502f)
                curveTo(9.502f, 20.883f, 8.382f, 22.003f, 7.001f, 22.003f)
                curveTo(5.62f, 22.003f, 4.5f, 20.883f, 4.5f, 19.502f)
                close()
            }
        }.build()

        return _ArrowDownExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownExclamation: ImageVector? = null

@Preview
@Composable
private fun ArrowDownExclamationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowDownExclamation, contentDescription = null)
    }
}
