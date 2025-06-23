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

public val FluentIcons.Filled.BookTheta: ImageVector
    get() {
        if (_BookTheta != null) {
            return _BookTheta!!
        }
        _BookTheta = ImageVector.Builder(
            name = "Filled.BookTheta",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.115f, 14.007f)
                curveTo(14.487f, 13.495f, 14.781f, 12.806f, 14.917f, 12f)
                horizontalLineTo(10.083f)
                curveTo(10.219f, 12.806f, 10.513f, 13.495f, 10.885f, 14.007f)
                curveTo(11.404f, 14.721f, 11.994f, 15f, 12.5f, 15f)
                curveTo(13.006f, 15f, 13.596f, 14.721f, 14.115f, 14.007f)
                close()
                moveTo(14.115f, 7.993f)
                curveTo(14.562f, 8.608f, 14.896f, 9.479f, 14.98f, 10.5f)
                horizontalLineTo(10.02f)
                curveTo(10.104f, 9.479f, 10.438f, 8.608f, 10.885f, 7.993f)
                curveTo(11.404f, 7.279f, 11.994f, 7f, 12.5f, 7f)
                curveTo(13.006f, 7f, 13.596f, 7.279f, 14.115f, 7.993f)
                close()
                moveTo(4f, 4.5f)
                curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
                horizontalLineTo(18f)
                curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.052f, 5.948f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 20.5f, 20.5f, 20.836f, 20.5f, 21.25f)
                curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(12.5f, 16.5f)
                curveTo(14.709f, 16.5f, 16.5f, 14.038f, 16.5f, 11f)
                curveTo(16.5f, 7.962f, 14.709f, 5.5f, 12.5f, 5.5f)
                curveTo(10.291f, 5.5f, 8.5f, 7.962f, 8.5f, 11f)
                curveTo(8.5f, 14.038f, 10.291f, 16.5f, 12.5f, 16.5f)
                close()
            }
        }.build()

        return _BookTheta!!
    }

@Suppress("ObjectPropertyName")
private var _BookTheta: ImageVector? = null

@Preview
@Composable
private fun BookThetaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BookTheta, contentDescription = null)
    }
}
