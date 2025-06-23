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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.PeopleSync: ImageVector
    get() {
        if (_PeopleSync != null) {
            return _PeopleSync!!
        }
        _PeopleSync = ImageVector.Builder(
            name = "Light.PeopleSync",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.5f, 4f)
                curveTo(7.462f, 4f, 5f, 6.462f, 5f, 9.5f)
                curveTo(5f, 12.538f, 7.462f, 15f, 10.5f, 15f)
                curveTo(13.538f, 15f, 16f, 12.538f, 16f, 9.5f)
                curveTo(16f, 6.462f, 13.538f, 4f, 10.5f, 4f)
                close()
                moveTo(6f, 9.5f)
                curveTo(6f, 7.015f, 8.015f, 5f, 10.5f, 5f)
                curveTo(12.985f, 5f, 15f, 7.015f, 15f, 9.5f)
                curveTo(15f, 11.985f, 12.985f, 14f, 10.5f, 14f)
                curveTo(8.015f, 14f, 6f, 11.985f, 6f, 9.5f)
                close()
                moveTo(23f, 7f)
                curveTo(20.791f, 7f, 19f, 8.791f, 19f, 11f)
                curveTo(19f, 13.209f, 20.791f, 15f, 23f, 15f)
                curveTo(25.209f, 15f, 27f, 13.209f, 27f, 11f)
                curveTo(27f, 8.791f, 25.209f, 7f, 23f, 7f)
                close()
                moveTo(20f, 11f)
                curveTo(20f, 9.343f, 21.343f, 8f, 23f, 8f)
                curveTo(24.657f, 8f, 26f, 9.343f, 26f, 11f)
                curveTo(26f, 12.657f, 24.657f, 14f, 23f, 14f)
                curveTo(21.343f, 14f, 20f, 12.657f, 20f, 11f)
                close()
                moveTo(16f, 17f)
                curveTo(16.387f, 17f, 16.757f, 17.073f, 17.096f, 17.207f)
                curveTo(16.806f, 17.46f, 16.531f, 17.731f, 16.275f, 18.019f)
                curveTo(16.185f, 18.006f, 16.093f, 18f, 16f, 18f)
                horizontalLineTo(5f)
                curveTo(3.895f, 18f, 3f, 18.895f, 3f, 20f)
                curveTo(3f, 20.884f, 3.333f, 22.12f, 4.406f, 23.137f)
                curveTo(5.476f, 24.151f, 7.339f, 25f, 10.5f, 25f)
                curveTo(11.918f, 25f, 13.075f, 24.829f, 14.017f, 24.549f)
                curveTo(14.037f, 24.89f, 14.076f, 25.226f, 14.134f, 25.556f)
                curveTo(13.121f, 25.837f, 11.919f, 26f, 10.5f, 26f)
                curveTo(7.161f, 26f, 5.024f, 25.099f, 3.719f, 23.863f)
                curveTo(2.417f, 22.63f, 2f, 21.116f, 2f, 20f)
                curveTo(2f, 18.343f, 3.343f, 17f, 5f, 17f)
                horizontalLineTo(16f)
                close()
                moveTo(30.5f, 24f)
                curveTo(30.5f, 19.858f, 27.142f, 16.5f, 23f, 16.5f)
                curveTo(18.858f, 16.5f, 15.5f, 19.858f, 15.5f, 24f)
                curveTo(15.5f, 28.142f, 18.858f, 31.5f, 23f, 31.5f)
                curveTo(27.142f, 31.5f, 30.5f, 28.142f, 30.5f, 24f)
                close()
                moveTo(27.75f, 24f)
                horizontalLineTo(24.75f)
                curveTo(24.336f, 24f, 24f, 23.664f, 24f, 23.25f)
                curveTo(24f, 22.836f, 24.336f, 22.5f, 24.75f, 22.5f)
                horizontalLineTo(25.599f)
                curveTo(25.08f, 21.603f, 24.11f, 21f, 23f, 21f)
                curveTo(22.324f, 21f, 21.7f, 21.224f, 21.198f, 21.601f)
                curveTo(20.97f, 21.773f, 20.665f, 21.832f, 20.409f, 21.705f)
                curveTo(19.916f, 21.458f, 19.774f, 20.815f, 20.205f, 20.473f)
                curveTo(20.973f, 19.864f, 21.944f, 19.5f, 23f, 19.5f)
                curveTo(24.742f, 19.5f, 26.252f, 20.489f, 27f, 21.936f)
                verticalLineTo(20.75f)
                curveTo(27f, 20.336f, 27.336f, 20f, 27.75f, 20f)
                curveTo(28.164f, 20f, 28.5f, 20.336f, 28.5f, 20.75f)
                verticalLineTo(23.25f)
                curveTo(28.5f, 23.664f, 28.164f, 24f, 27.75f, 24f)
                close()
                moveTo(25.576f, 26.576f)
                curveTo(25.911f, 26.911f, 25.914f, 27.462f, 25.522f, 27.727f)
                curveTo(24.803f, 28.215f, 23.935f, 28.5f, 23f, 28.5f)
                curveTo(21.258f, 28.5f, 19.748f, 27.511f, 19f, 26.064f)
                verticalLineTo(27.25f)
                curveTo(19f, 27.664f, 18.664f, 28f, 18.25f, 28f)
                curveTo(17.836f, 28f, 17.5f, 27.664f, 17.5f, 27.25f)
                verticalLineTo(24.75f)
                curveTo(17.5f, 24.336f, 17.836f, 24f, 18.25f, 24f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 24f, 22f, 24.336f, 22f, 24.75f)
                curveTo(22f, 25.164f, 21.664f, 25.5f, 21.25f, 25.5f)
                horizontalLineTo(20.401f)
                curveTo(20.92f, 26.397f, 21.89f, 27f, 23f, 27f)
                curveTo(23.597f, 27f, 24.154f, 26.825f, 24.622f, 26.524f)
                curveTo(24.92f, 26.332f, 25.325f, 26.325f, 25.576f, 26.576f)
                close()
            }
        }.build()

        return _PeopleSync!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleSync: ImageVector? = null

@Preview
@Composable
private fun PeopleSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.PeopleSync, contentDescription = null)
    }
}
