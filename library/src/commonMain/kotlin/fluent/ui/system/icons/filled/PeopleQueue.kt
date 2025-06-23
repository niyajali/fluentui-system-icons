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

public val FluentIcons.Filled.PeopleQueue: ImageVector
    get() {
        if (_PeopleQueue != null) {
            return _PeopleQueue!!
        }
        _PeopleQueue = ImageVector.Builder(
            name = "Filled.PeopleQueue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.5f, 6f)
                curveTo(10.5f, 7.657f, 9.157f, 9f, 7.5f, 9f)
                curveTo(5.843f, 9f, 4.5f, 7.657f, 4.5f, 6f)
                curveTo(4.5f, 4.343f, 5.843f, 3f, 7.5f, 3f)
                curveTo(9.157f, 3f, 10.5f, 4.343f, 10.5f, 6f)
                close()
                moveTo(4.75f, 10f)
                curveTo(3.783f, 10f, 3f, 10.783f, 3f, 11.75f)
                verticalLineTo(16.5f)
                curveTo(3f, 18.985f, 5.015f, 21f, 7.5f, 21f)
                curveTo(9.985f, 21f, 12f, 18.985f, 12f, 16.5f)
                verticalLineTo(11.75f)
                curveTo(12f, 10.783f, 11.217f, 10f, 10.25f, 10f)
                horizontalLineTo(4.75f)
                close()
                moveTo(10.86f, 20.854f)
                curveTo(12.162f, 19.849f, 13f, 18.272f, 13f, 16.5f)
                verticalLineTo(11.75f)
                curveTo(13f, 11.085f, 12.764f, 10.476f, 12.371f, 10f)
                horizontalLineTo(14.75f)
                curveTo(15.716f, 10f, 16.5f, 10.783f, 16.5f, 11.75f)
                verticalLineTo(16.5f)
                curveTo(16.5f, 18.985f, 14.485f, 21f, 12f, 21f)
                curveTo(11.606f, 21f, 11.224f, 20.949f, 10.86f, 20.854f)
                close()
                moveTo(11.5f, 6f)
                curveTo(11.5f, 6.999f, 11.133f, 7.913f, 10.527f, 8.614f)
                curveTo(10.962f, 8.86f, 11.465f, 9f, 12f, 9f)
                curveTo(13.657f, 9f, 15f, 7.657f, 15f, 6f)
                curveTo(15f, 4.343f, 13.657f, 3f, 12f, 3f)
                curveTo(11.465f, 3f, 10.962f, 3.14f, 10.527f, 3.386f)
                curveTo(11.133f, 4.087f, 11.5f, 5.001f, 11.5f, 6f)
                close()
                moveTo(15.36f, 20.854f)
                curveTo(16.662f, 19.849f, 17.5f, 18.272f, 17.5f, 16.5f)
                verticalLineTo(11.75f)
                curveTo(17.5f, 11.085f, 17.264f, 10.476f, 16.871f, 10f)
                horizontalLineTo(19.25f)
                curveTo(20.216f, 10f, 21f, 10.783f, 21f, 11.75f)
                verticalLineTo(16.5f)
                curveTo(21f, 18.985f, 18.985f, 21f, 16.5f, 21f)
                curveTo(16.106f, 21f, 15.724f, 20.949f, 15.36f, 20.854f)
                close()
                moveTo(16f, 6f)
                curveTo(16f, 6.999f, 15.633f, 7.913f, 15.027f, 8.614f)
                curveTo(15.462f, 8.86f, 15.965f, 9f, 16.5f, 9f)
                curveTo(18.157f, 9f, 19.5f, 7.657f, 19.5f, 6f)
                curveTo(19.5f, 4.343f, 18.157f, 3f, 16.5f, 3f)
                curveTo(15.965f, 3f, 15.462f, 3.14f, 15.027f, 3.386f)
                curveTo(15.633f, 4.087f, 16f, 5.001f, 16f, 6f)
                close()
            }
        }.build()

        return _PeopleQueue!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleQueue: ImageVector? = null

@Preview
@Composable
private fun PeopleQueuePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PeopleQueue, contentDescription = null)
    }
}
