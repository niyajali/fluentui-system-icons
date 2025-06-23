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

public val FluentIcons.Filled.ShieldQuestion: ImageVector
    get() {
        if (_ShieldQuestion != null) {
            return _ShieldQuestion!!
        }
        _ShieldQuestion = ImageVector.Builder(
            name = "Filled.ShieldQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 5.75f)
                curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
                curveTo(6.413f, 5f, 9.008f, 4.057f, 11.55f, 2.15f)
                curveTo(11.817f, 1.95f, 12.183f, 1.95f, 12.45f, 2.15f)
                curveTo(14.992f, 4.057f, 17.587f, 5f, 20.25f, 5f)
                curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
                verticalLineTo(11f)
                curveTo(21f, 16.001f, 18.042f, 19.676f, 12.275f, 21.948f)
                curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.725f, 21.948f)
                curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
                verticalLineTo(5.75f)
                close()
                moveTo(13f, 16f)
                curveTo(13f, 15.448f, 12.552f, 15f, 12f, 15f)
                curveTo(11.448f, 15f, 11f, 15.448f, 11f, 16f)
                curveTo(11f, 16.552f, 11.448f, 17f, 12f, 17f)
                curveTo(12.552f, 17f, 13f, 16.552f, 13f, 16f)
                close()
                moveTo(10.75f, 9.75f)
                curveTo(10.75f, 9.06f, 11.31f, 8.5f, 12f, 8.5f)
                curveTo(12.69f, 8.5f, 13.25f, 9.06f, 13.25f, 9.75f)
                curveTo(13.25f, 10.197f, 13.002f, 10.487f, 12.47f, 11.018f)
                lineTo(12.423f, 11.065f)
                curveTo(11.952f, 11.533f, 11.25f, 12.232f, 11.25f, 13.35f)
                curveTo(11.25f, 13.764f, 11.586f, 14.1f, 12f, 14.1f)
                curveTo(12.414f, 14.1f, 12.75f, 13.764f, 12.75f, 13.35f)
                curveTo(12.75f, 12.901f, 12.999f, 12.609f, 13.53f, 12.079f)
                lineTo(13.579f, 12.03f)
                curveTo(14.049f, 11.563f, 14.75f, 10.865f, 14.75f, 9.75f)
                curveTo(14.75f, 8.231f, 13.519f, 7f, 12f, 7f)
                curveTo(10.481f, 7f, 9.25f, 8.231f, 9.25f, 9.75f)
                curveTo(9.25f, 10.164f, 9.586f, 10.5f, 10f, 10.5f)
                curveTo(10.414f, 10.5f, 10.75f, 10.164f, 10.75f, 9.75f)
                close()
            }
        }.build()

        return _ShieldQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldQuestion: ImageVector? = null

@Preview
@Composable
private fun ShieldQuestionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShieldQuestion, contentDescription = null)
    }
}
