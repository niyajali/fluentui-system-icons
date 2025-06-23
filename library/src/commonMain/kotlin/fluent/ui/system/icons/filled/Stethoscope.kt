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

public val FluentIcons.Filled.Stethoscope: ImageVector
    get() {
        if (_Stethoscope != null) {
            return _Stethoscope!!
        }
        _Stethoscope = ImageVector.Builder(
            name = "Filled.Stethoscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 2.5f)
                curveTo(2.448f, 2.5f, 2f, 2.948f, 2f, 3.5f)
                lineTo(2f, 9f)
                curveTo(2f, 10.741f, 2.614f, 12.256f, 3.711f, 13.337f)
                curveTo(4.583f, 14.197f, 5.721f, 14.743f, 7f, 14.929f)
                verticalLineTo(15.75f)
                curveTo(7f, 19.202f, 9.798f, 22f, 13.25f, 22f)
                curveTo(16.702f, 22f, 19.5f, 19.202f, 19.5f, 15.75f)
                verticalLineTo(15.093f)
                curveTo(20.806f, 14.672f, 21.75f, 13.446f, 21.75f, 12f)
                curveTo(21.75f, 10.205f, 20.295f, 8.75f, 18.5f, 8.75f)
                curveTo(16.705f, 8.75f, 15.25f, 10.205f, 15.25f, 12f)
                curveTo(15.25f, 13.446f, 16.194f, 14.672f, 17.5f, 15.093f)
                verticalLineTo(15.75f)
                curveTo(17.5f, 18.097f, 15.597f, 20f, 13.25f, 20f)
                curveTo(10.903f, 20f, 9f, 18.097f, 9f, 15.75f)
                verticalLineTo(14.929f)
                curveTo(10.279f, 14.743f, 11.417f, 14.197f, 12.289f, 13.337f)
                curveTo(13.386f, 12.256f, 14f, 10.741f, 14f, 9f)
                verticalLineTo(3.5f)
                curveTo(14f, 2.948f, 13.552f, 2.5f, 13f, 2.5f)
                horizontalLineTo(11.002f)
                curveTo(10.45f, 2.5f, 10.002f, 2.948f, 10.002f, 3.5f)
                curveTo(10.002f, 4.052f, 10.45f, 4.5f, 11.002f, 4.5f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                curveTo(12f, 10.259f, 11.564f, 11.244f, 10.885f, 11.913f)
                curveTo(10.204f, 12.584f, 9.216f, 13f, 8f, 13f)
                curveTo(6.784f, 13f, 5.796f, 12.584f, 5.115f, 11.913f)
                curveTo(4.436f, 11.244f, 4f, 10.259f, 4f, 9f)
                lineTo(4f, 4.5f)
                horizontalLineTo(5f)
                curveTo(5.552f, 4.5f, 6f, 4.052f, 6f, 3.5f)
                curveTo(6f, 2.948f, 5.552f, 2.5f, 5f, 2.5f)
                horizontalLineTo(3f)
                close()
                moveTo(18.5f, 10.75f)
                curveTo(19.19f, 10.75f, 19.75f, 11.31f, 19.75f, 12f)
                curveTo(19.75f, 12.691f, 19.19f, 13.25f, 18.5f, 13.25f)
                curveTo(17.81f, 13.25f, 17.25f, 12.691f, 17.25f, 12f)
                curveTo(17.25f, 11.31f, 17.81f, 10.75f, 18.5f, 10.75f)
                close()
            }
        }.build()

        return _Stethoscope!!
    }

@Suppress("ObjectPropertyName")
private var _Stethoscope: ImageVector? = null

@Preview
@Composable
private fun StethoscopePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Stethoscope, contentDescription = null)
    }
}
