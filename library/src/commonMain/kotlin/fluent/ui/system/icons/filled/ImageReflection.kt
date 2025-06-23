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

public val FluentIcons.Filled.ImageReflection: ImageVector
    get() {
        if (_ImageReflection != null) {
            return _ImageReflection!!
        }
        _ImageReflection = ImageVector.Builder(
            name = "Filled.ImageReflection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 6.25f)
                curveTo(4f, 4.455f, 5.455f, 3f, 7.25f, 3f)
                horizontalLineTo(16.75f)
                curveTo(18.545f, 3f, 20f, 4.455f, 20f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(20f, 16.255f, 19.544f, 17.154f, 18.827f, 17.75f)
                curveTo(19.544f, 18.346f, 20f, 19.245f, 20f, 20.25f)
                verticalLineTo(21f)
                curveTo(20f, 21.414f, 19.664f, 21.75f, 19.25f, 21.75f)
                curveTo(18.836f, 21.75f, 18.5f, 21.414f, 18.5f, 21f)
                verticalLineTo(20.25f)
                curveTo(18.5f, 19.284f, 17.716f, 18.5f, 16.75f, 18.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 18.5f, 15f, 18.164f, 15f, 17.75f)
                curveTo(15f, 17.662f, 15.015f, 17.578f, 15.043f, 17.5f)
                horizontalLineTo(13.457f)
                curveTo(13.485f, 17.578f, 13.5f, 17.662f, 13.5f, 17.75f)
                curveTo(13.5f, 18.164f, 13.164f, 18.5f, 12.75f, 18.5f)
                horizontalLineTo(11.25f)
                curveTo(10.836f, 18.5f, 10.5f, 18.164f, 10.5f, 17.75f)
                curveTo(10.5f, 17.662f, 10.515f, 17.578f, 10.543f, 17.5f)
                horizontalLineTo(8.957f)
                curveTo(8.985f, 17.578f, 9f, 17.662f, 9f, 17.75f)
                curveTo(9f, 18.164f, 8.664f, 18.5f, 8.25f, 18.5f)
                horizontalLineTo(7.25f)
                curveTo(6.284f, 18.5f, 5.5f, 19.284f, 5.5f, 20.25f)
                verticalLineTo(21f)
                curveTo(5.5f, 21.414f, 5.164f, 21.75f, 4.75f, 21.75f)
                curveTo(4.336f, 21.75f, 4f, 21.414f, 4f, 21f)
                verticalLineTo(20.25f)
                curveTo(4f, 19.245f, 4.456f, 18.346f, 5.173f, 17.75f)
                curveTo(4.999f, 17.605f, 4.84f, 17.442f, 4.699f, 17.264f)
                curveTo(4.261f, 16.71f, 4f, 16.01f, 4f, 15.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(5.781f, 16.202f)
                curveTo(6.07f, 16.647f, 6.556f, 16.952f, 7.115f, 16.995f)
                lineTo(11.479f, 12.713f)
                curveTo(11.77f, 12.428f, 12.236f, 12.427f, 12.527f, 12.712f)
                lineTo(16.918f, 16.992f)
                curveTo(17.472f, 16.939f, 17.951f, 16.628f, 18.233f, 16.18f)
                lineTo(13.575f, 11.638f)
                curveTo(12.699f, 10.784f, 11.301f, 10.786f, 10.428f, 11.642f)
                lineTo(5.781f, 16.202f)
                close()
                moveTo(15f, 9f)
                curveTo(15.69f, 9f, 16.25f, 8.44f, 16.25f, 7.75f)
                curveTo(16.25f, 7.06f, 15.69f, 6.5f, 15f, 6.5f)
                curveTo(14.31f, 6.5f, 13.75f, 7.06f, 13.75f, 7.75f)
                curveTo(13.75f, 8.44f, 14.31f, 9f, 15f, 9f)
                close()
            }
        }.build()

        return _ImageReflection!!
    }

@Suppress("ObjectPropertyName")
private var _ImageReflection: ImageVector? = null

@Preview
@Composable
private fun ImageReflectionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ImageReflection, contentDescription = null)
    }
}
