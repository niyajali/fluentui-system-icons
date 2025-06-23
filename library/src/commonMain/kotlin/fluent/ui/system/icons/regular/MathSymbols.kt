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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.MathSymbols: ImageVector
    get() {
        if (_MathSymbols != null) {
            return _MathSymbols!!
        }
        _MathSymbols = ImageVector.Builder(
            name = "Regular.MathSymbols",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 2f)
                curveTo(6.664f, 2f, 7f, 2.336f, 7f, 2.75f)
                verticalLineTo(5.5f)
                horizontalLineTo(9.75f)
                curveTo(10.164f, 5.5f, 10.5f, 5.836f, 10.5f, 6.25f)
                curveTo(10.5f, 6.664f, 10.164f, 7f, 9.75f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(9.75f)
                curveTo(7f, 10.164f, 6.664f, 10.5f, 6.25f, 10.5f)
                curveTo(5.836f, 10.5f, 5.5f, 10.164f, 5.5f, 9.75f)
                verticalLineTo(7f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 7f, 2f, 6.664f, 2f, 6.25f)
                curveTo(2f, 5.836f, 2.336f, 5.5f, 2.75f, 5.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(2.75f)
                curveTo(5.5f, 2.336f, 5.836f, 2f, 6.25f, 2f)
                close()
                moveTo(14.25f, 5.5f)
                curveTo(13.836f, 5.5f, 13.5f, 5.836f, 13.5f, 6.25f)
                curveTo(13.5f, 6.664f, 13.836f, 7f, 14.25f, 7f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 7f, 22f, 6.664f, 22f, 6.25f)
                curveTo(22f, 5.836f, 21.664f, 5.5f, 21.25f, 5.5f)
                horizontalLineTo(14.25f)
                close()
                moveTo(13.5f, 17.75f)
                curveTo(13.5f, 17.336f, 13.836f, 17f, 14.25f, 17f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 17f, 22f, 17.336f, 22f, 17.75f)
                curveTo(22f, 18.164f, 21.664f, 18.5f, 21.25f, 18.5f)
                horizontalLineTo(14.25f)
                curveTo(13.836f, 18.5f, 13.5f, 18.164f, 13.5f, 17.75f)
                close()
                moveTo(17.75f, 16f)
                curveTo(18.302f, 16f, 18.75f, 15.552f, 18.75f, 15f)
                curveTo(18.75f, 14.448f, 18.302f, 14f, 17.75f, 14f)
                curveTo(17.198f, 14f, 16.75f, 14.448f, 16.75f, 15f)
                curveTo(16.75f, 15.552f, 17.198f, 16f, 17.75f, 16f)
                close()
                moveTo(18.75f, 21f)
                curveTo(18.75f, 21.552f, 18.302f, 22f, 17.75f, 22f)
                curveTo(17.198f, 22f, 16.75f, 21.552f, 16.75f, 21f)
                curveTo(16.75f, 20.448f, 17.198f, 20f, 17.75f, 20f)
                curveTo(18.302f, 20f, 18.75f, 20.448f, 18.75f, 21f)
                close()
                moveTo(2.22f, 14.28f)
                curveTo(1.927f, 13.987f, 1.927f, 13.513f, 2.22f, 13.22f)
                curveTo(2.513f, 12.927f, 2.987f, 12.927f, 3.28f, 13.22f)
                lineTo(6.25f, 16.189f)
                lineTo(9.22f, 13.22f)
                curveTo(9.513f, 12.927f, 9.987f, 12.927f, 10.28f, 13.22f)
                curveTo(10.573f, 13.513f, 10.573f, 13.987f, 10.28f, 14.28f)
                lineTo(7.311f, 17.25f)
                lineTo(10.28f, 20.22f)
                curveTo(10.573f, 20.513f, 10.573f, 20.987f, 10.28f, 21.28f)
                curveTo(9.987f, 21.573f, 9.513f, 21.573f, 9.22f, 21.28f)
                lineTo(6.25f, 18.311f)
                lineTo(3.28f, 21.28f)
                curveTo(2.987f, 21.573f, 2.513f, 21.573f, 2.22f, 21.28f)
                curveTo(1.927f, 20.987f, 1.927f, 20.513f, 2.22f, 20.22f)
                lineTo(5.189f, 17.25f)
                lineTo(2.22f, 14.28f)
                close()
            }
        }.build()

        return _MathSymbols!!
    }

@Suppress("ObjectPropertyName")
private var _MathSymbols: ImageVector? = null

@Preview
@Composable
private fun MathSymbolsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MathSymbols, contentDescription = null)
    }
}
