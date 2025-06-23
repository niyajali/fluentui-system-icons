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

public val FluentIcons.Regular.CloudSync: ImageVector
    get() {
        if (_CloudSync != null) {
            return _CloudSync!!
        }
        _CloudSync = ImageVector.Builder(
            name = "Regular.CloudSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 4.5f)
                curveTo(9.587f, 4.5f, 7.617f, 6.4f, 7.505f, 8.785f)
                curveTo(7.486f, 9.185f, 7.156f, 9.5f, 6.756f, 9.5f)
                horizontalLineTo(6.5f)
                curveTo(4.843f, 9.5f, 3.5f, 10.843f, 3.5f, 12.5f)
                curveTo(3.5f, 14.157f, 4.843f, 15.5f, 6.5f, 15.5f)
                horizontalLineTo(10.076f)
                curveTo(10.026f, 15.826f, 10f, 16.16f, 10f, 16.5f)
                curveTo(10f, 16.668f, 10.006f, 16.835f, 10.019f, 17f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 17f, 2f, 14.985f, 2f, 12.5f)
                curveTo(2f, 10.156f, 3.792f, 8.231f, 6.08f, 8.019f)
                curveTo(6.548f, 5.172f, 9.02f, 3f, 12f, 3f)
                curveTo(14.98f, 3f, 17.452f, 5.172f, 17.92f, 8.019f)
                curveTo(20.208f, 8.231f, 22f, 10.156f, 22f, 12.5f)
                curveTo(22f, 12.666f, 21.991f, 12.831f, 21.973f, 12.993f)
                curveTo(21.503f, 12.26f, 20.89f, 11.628f, 20.173f, 11.137f)
                curveTo(19.676f, 10.165f, 18.666f, 9.5f, 17.5f, 9.5f)
                horizontalLineTo(17.244f)
                curveTo(16.844f, 9.5f, 16.514f, 9.185f, 16.495f, 8.785f)
                curveTo(16.383f, 6.4f, 14.413f, 4.5f, 12f, 4.5f)
                close()
                moveTo(16.5f, 22f)
                curveTo(19.538f, 22f, 22f, 19.538f, 22f, 16.5f)
                curveTo(22f, 13.462f, 19.538f, 11f, 16.5f, 11f)
                curveTo(13.462f, 11f, 11f, 13.462f, 11f, 16.5f)
                curveTo(11f, 19.538f, 13.462f, 22f, 16.5f, 22f)
                close()
                moveTo(18.5f, 15f)
                curveTo(18.044f, 14.392f, 17.317f, 14f, 16.5f, 14f)
                curveTo(15.76f, 14f, 15.095f, 14.321f, 14.637f, 14.833f)
                curveTo(14.452f, 15.039f, 14.136f, 15.057f, 13.931f, 14.873f)
                curveTo(13.725f, 14.688f, 13.707f, 14.372f, 13.891f, 14.167f)
                curveTo(14.531f, 13.451f, 15.463f, 13f, 16.5f, 13f)
                curveTo(17.48f, 13f, 18.365f, 13.403f, 19f, 14.051f)
                verticalLineTo(13.5f)
                curveTo(19f, 13.224f, 19.224f, 13f, 19.5f, 13f)
                curveTo(19.776f, 13f, 20f, 13.224f, 20f, 13.5f)
                verticalLineTo(15.5f)
                curveTo(20f, 15.776f, 19.776f, 16f, 19.5f, 16f)
                horizontalLineTo(17.5f)
                curveTo(17.224f, 16f, 17f, 15.776f, 17f, 15.5f)
                curveTo(17f, 15.224f, 17.224f, 15f, 17.5f, 15f)
                horizontalLineTo(18.5f)
                close()
                moveTo(13f, 17.5f)
                curveTo(13f, 17.224f, 13.224f, 17f, 13.5f, 17f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 17f, 16f, 17.224f, 16f, 17.5f)
                curveTo(16f, 17.776f, 15.776f, 18f, 15.5f, 18f)
                horizontalLineTo(14.5f)
                curveTo(14.956f, 18.608f, 15.683f, 19f, 16.5f, 19f)
                curveTo(17.24f, 19f, 17.905f, 18.679f, 18.364f, 18.167f)
                curveTo(18.548f, 17.961f, 18.864f, 17.943f, 19.069f, 18.127f)
                curveTo(19.275f, 18.312f, 19.293f, 18.628f, 19.109f, 18.833f)
                curveTo(18.469f, 19.549f, 17.537f, 20f, 16.5f, 20f)
                curveTo(15.52f, 20f, 14.635f, 19.597f, 14f, 18.949f)
                verticalLineTo(19.5f)
                curveTo(14f, 19.776f, 13.776f, 20f, 13.5f, 20f)
                curveTo(13.224f, 20f, 13f, 19.776f, 13f, 19.5f)
                verticalLineTo(17.5f)
                close()
            }
        }.build()

        return _CloudSync!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSync: ImageVector? = null

@Preview
@Composable
private fun CloudSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CloudSync, contentDescription = null)
    }
}
